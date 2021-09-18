package com.a.service;

import com.a.entity.Menus;
import com.a.entity.MenusOrder;

import java.util.List;

public interface MenusService {
    List<Menus> selectMenus();
}
