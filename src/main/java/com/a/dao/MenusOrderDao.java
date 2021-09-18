package com.a.dao;


import com.a.entity.MenusOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenusOrderDao {
    @Insert("insert into menus_order value (#{d_O_Id},#{d_M_Id},#{d_Num})")
    void insertMenusOrder(MenusOrder menusOrder);

    @Select("select * from menus_order order by d_o_id")
    List<MenusOrder> selectMenusOrder();
}
