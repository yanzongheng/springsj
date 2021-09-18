package com.a.service;

import com.a.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
    List<Order> selectTable();
    void insertOrder(Order order);
    int sumPrice(Integer integer);
}
