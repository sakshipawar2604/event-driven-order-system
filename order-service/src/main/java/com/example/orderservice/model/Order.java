package com.example.orderservice.model;

import java.util.UUID;

public class Order {

    private String id;
    private String productId;
    private int quantity;
    private String status;

    public Order(String productId, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.productId = productId;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public String getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }
}