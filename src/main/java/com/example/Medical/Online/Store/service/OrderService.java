package com.example.Medical.Online.Store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Medical.Online.Store.model.Order;
import com.example.Medical.Online.Store.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Order saveOrder(Order order) {
        return repo.save(order);
    }
}