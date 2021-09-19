package com.a.dao;


import com.a.entity.MenusOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenusOrderDao {
    void insertMenusOrder(List<MenusOrder> menusOrders);

    @Select("select * from menus_order where d_t_id = #{tableId}")
    List<MenusOrder> selectMenusOrder(@Param("tableId")String tableId);

    int sumPrice(@Param("tableId")String tableId);
}
