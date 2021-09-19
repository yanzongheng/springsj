package com.a.service;

import com.a.entity.MenusOrder;

import java.util.List;

public interface MenusOrderService {

    void insertMenusOrder(List<MenusOrder> menusOrders);

    int sumPrice(String tableId);
}
