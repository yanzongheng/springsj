package com.a.impl;

import com.a.dao.OrderDao;
import com.a.entity.Order;
import com.a.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> selectTable() {
        return orderDao.selectOrder();
    }

    @Override
    public void insertOrder(Order order) {
        orderDao.insertOrder(order);
    }

    @Override
    public int sumPrice(Integer integer) {
         return orderDao.sumPrice(integer);
    }
}
