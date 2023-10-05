package com.example.rewards.ecomm.repository;

import com.example.rewards.ecomm.model.MyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<MyModel.Customer, Long> {

}