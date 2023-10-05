package com.example.rewards.ecomm.service;

import com.example.rewards.ecomm.model.MyModel;
import com.example.rewards.ecomm.repository.CustomerRepository;
import com.example.rewards.ecomm.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MyDataService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    public void initializeData() {

        MyModel.Customer customer1 = new MyModel.Customer("John Snow");
        MyModel.Customer customer2 = new MyModel.Customer("Ned Stark");
        customerRepository.save(customer1);
        customerRepository.save(customer2);


        MyModel.Purchase purchase1 = new MyModel.Purchase(120.0, LocalDateTime.now(), customer1);
        MyModel.Purchase purchase2 = new MyModel.Purchase(80.0, LocalDateTime.now(), customer1);
        MyModel.Purchase purchase3 = new MyModel.Purchase(150.0, LocalDateTime.now(), customer2);
        purchaseRepository.save(purchase1);
        purchaseRepository.save(purchase2);
        purchaseRepository.save(purchase3);

    }
}
