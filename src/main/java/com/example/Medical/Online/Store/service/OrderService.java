package com.example.Medical.Online.Store.service;

import com.example.Medical.Online.Store.model.Order;
import com.example.Medical.Online.Store.repository.OrderRepository;

public class OrderService {

    private OrderRepository repo;

    public Order saveOrder(Order order){
        return repo.save(order);
    }
}
