package com.example.rewards.ecomm;

import com.example.rewards.ecomm.model.MyModel;
import com.example.rewards.ecomm.repository.CustomerRepository;
import com.example.rewards.ecomm.repository.RewardRepository;
import com.example.rewards.ecomm.service.RewardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RewardServiceTest {

    @Autowired
    private RewardService rewardService;

    @Autowired
    private RewardRepository rewardRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCalculateAndStoreRewardPoints() {

        MyModel.Customer customer = new MyModel.Customer();
        customer.setName("M. Asif");
        customerRepository.save(customer);


        MyModel.Purchase purchase = new MyModel.Purchase();
        purchase.setPurchaseAmount(120.0);
        purchase.setCustomer(customer);
        purchase.setPurchaseDate(LocalDateTime.now());

        rewardService.calculateAndStoreRewardPoints(purchase);


        List<MyModel.Reward> rewards = rewardRepository.findByCustomer(customer);
        assertEquals(1, rewards.size());
        MyModel.Reward reward = rewards.get(0);
        assertEquals(90, reward.getPoints());
    }
}
