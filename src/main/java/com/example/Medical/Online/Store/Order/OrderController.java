package com.example.Medical.Online.Store.Order;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/orders")

public class OrderController {
    private OrderService service = new OrderService();

    @PostMapping("/add")
    public String addOrder(@RequestBody Order order){
        try {
            service.placeOrder(order);
            return "Order Saved!";

        } catch (Exception e){
            return "Error Saving Order";
        }
    }
}
