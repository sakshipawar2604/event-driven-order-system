package com.example.orderservice.dto;

public class OrderResponse {

    private String id;
    private String productId;
    private int quantity;
    private String status;

    public OrderResponse(String id, String productId, int quantity, String status) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
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