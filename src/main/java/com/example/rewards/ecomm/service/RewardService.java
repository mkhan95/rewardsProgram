package com.example.rewards.ecomm.service;

import com.example.rewards.ecomm.model.MyModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RewardService {
    public void calculateAndStoreRewardPoints(MyModel.Purchase purchase) {
        double purchaseAmount = purchase.getPurchaseAmount();
        int rewardPoints = 0;

        if (purchaseAmount > 50) {
            rewardPoints += (int) (purchaseAmount - 50);
        }
        if (purchaseAmount > 100) {
            rewardPoints += (int) (purchaseAmount - 100);
        }

        MyModel.Reward reward = new MyModel.Reward();
        reward.setPoints(rewardPoints);
        reward.setRewardDate(LocalDateTime.now());
        reward.setCustomer(purchase.getCustomer());

    }
}
