package com.example.rewards.ecomm.controller;

import com.example.rewards.ecomm.service.MyDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
@Api(value = "Data Management", description = "Endpoints for managing data")
public class MyDataController {

    @Autowired
    private MyDataService dataInitializationService;

    @PostMapping("/api/data/initialize")
    public ResponseEntity<String> initializeData() {
        dataInitializationService.initializeData();
        return ResponseEntity.ok("Data posted.");
    }
}

