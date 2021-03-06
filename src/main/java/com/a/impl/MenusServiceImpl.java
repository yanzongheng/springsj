package com.a.impl;

import com.a.dao.MenusDao;
import com.a.entity.Menus;
import com.a.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MenusServiceImpl implements MenusService {
    @Autowired
    private MenusDao menusDao;

    @Override
    public List<Menus> selectMenus() {
        return menusDao.selectMenus();
    }
}
