package com.a.dao;

import com.a.entity.MenusOrder;
import com.a.entity.MenusOrderAndMenus;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenusOrderAndMenusDao {

    @Select("select m_name,m_price,mo.d_num as d_num\n" +
            "from menus m,menus_order mo\n" +
            "where m.m_id =mo.d_m_id\n" +
            "and mo.d_t_id = #{tableId}")
    List<MenusOrderAndMenus> selectMenusOrder(@Param("tableId")String tableId);
}
