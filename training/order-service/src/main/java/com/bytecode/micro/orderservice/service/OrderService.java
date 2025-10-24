package com.bytecode.micro.orderservice.service;

import com.bytecode.micro.orderservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final List<Order> orders = Arrays.asList(
            new Order(101, 100, "Laptop", 75000),
            new Order(102, 101, "Mouse", 1500),
            new Order(103, 100, "Keyboard", 2500),
            new Order(104, 3, "Monitor", 12000)
    );

    public List<Order> getAllOrders() {
        return orders;
    }

    public List<Order> getOrdersByCustomerId(int customerId) {
        return orders.stream()
                .filter(o -> o.getCustomerId() == customerId)
                .collect(Collectors.toList());
    }
}
