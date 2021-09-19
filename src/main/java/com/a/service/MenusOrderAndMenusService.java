package com.a.service;

import com.a.entity.MenusOrderAndMenus;

import java.util.List;

public interface MenusOrderAndMenusService {

    List<MenusOrderAndMenus> selectMenusOrder(String tableId);
}
