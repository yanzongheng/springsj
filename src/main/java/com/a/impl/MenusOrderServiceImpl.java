package com.a.impl;

import com.a.dao.MenusOrderDao;
import com.a.entity.MenusOrder;
import com.a.service.MenusOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenusOrderServiceImpl implements MenusOrderService {

    @Autowired
    private MenusOrderDao menusOrderDao;

    @Override
    public void insertMenusOrder(List<MenusOrder> menusOrders) {
        menusOrderDao.insertMenusOrder(menusOrders);
    }

    @Override
    public List<MenusOrder> selectMenusOrder(String tableId) {
        return menusOrderDao.selectMenusOrder(tableId);
    }
}
