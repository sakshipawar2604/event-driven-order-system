package com.example.orderservice.dto;

public class CreateOrderRequest {

    private String productId;
    private int quantity;

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}