package com.example.Medical.Online.Store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Medical.Online.Store.model.Order;
import com.example.Medical.Online.Store.service.OrderService;


@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        return service.saveOrder(order);
    }
}
