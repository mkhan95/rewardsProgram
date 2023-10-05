package com.example.rewards.ecomm.repository;

import com.example.rewards.ecomm.model.MyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RewardRepository extends JpaRepository<MyModel.Reward, Long> {
    List<MyModel.Reward> findByCustomer(MyModel.Customer customer);
}
