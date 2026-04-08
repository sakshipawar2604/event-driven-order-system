package com.example.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String id;
    private String productId;
    private int quantity;
    private String status;

    public Order() {
    }

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

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}