package com.example.rewards.ecomm.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.example.rewards.ecomm.service.RewardService;
import com.example.rewards.ecomm.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchases")
@Api(value = "Purchase Management", description = "Endpoints for managing purchases")
public class MyRestcontroller {
    @Autowired
    private RewardService rewardService;

    @PostMapping
    public ResponseEntity<String> recordPurchase(@RequestBody MyModel.Purchase purchase) {
        rewardService.calculateAndStoreRewardPoints(purchase);
        return ResponseEntity.ok("Purchase record has been stored!");
    }
}

