package com.a.impl;

import com.a.dao.MenusOrderAndMenusDao;
import com.a.entity.MenusOrderAndMenus;
import com.a.service.MenusOrderAndMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenusOrderAndMenusServiceImpl implements MenusOrderAndMenusService {
    @Autowired
    private MenusOrderAndMenusDao menusOrderAndMenusDao;

    @Override
    public List<MenusOrderAndMenus> selectMenusOrder(String tableId) {
        return menusOrderAndMenusDao.selectMenusOrder(tableId);
    }
}
