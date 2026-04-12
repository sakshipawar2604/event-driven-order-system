package com.example.orderservice.model;

public enum OrderStatus {
    CREATED,
    INVENTORY_RESERVED,
    PAYMENT_PENDING,
    PAYMENT_COMPLETED,
    FAILED
}
