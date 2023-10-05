package com.example.rewards.ecomm.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class MyModel {

    @Entity
    public static class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    @Entity
    public static class Purchase {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private double purchaseAmount;
        private LocalDateTime purchaseDate;
        @ManyToOne
        private Customer customer;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public double getPurchaseAmount() {
            return purchaseAmount;
        }

        public void setPurchaseAmount(double purchaseAmount) {
            this.purchaseAmount = purchaseAmount;
        }

        public LocalDateTime getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(LocalDateTime purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
    }

    @Entity
    public static class Reward {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private int points;
        private LocalDateTime rewardDate;
        @ManyToOne
        private Customer customer;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public LocalDateTime getRewardDate() {
            return rewardDate;
        }

        public void setRewardDate(LocalDateTime rewardDate) {
            this.rewardDate = rewardDate;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

    }
}
