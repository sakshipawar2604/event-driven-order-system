package com.example.orderservice.service;

import com.example.orderservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public Order createOrder(String productId, int quantity) {
        Order order = new Order(productId, quantity);
        orders.add(order);
        return order;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}