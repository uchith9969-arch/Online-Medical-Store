package com.example.Medical.Online.Store.repository;

import com.example.Medical.Online.Store.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends com.example.Medical.Online.Store.repository.JpaRepository<Order, String> {
}