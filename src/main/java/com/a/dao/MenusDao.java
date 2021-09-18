package com.a.dao;

import com.a.entity.Menus;
import com.a.entity.MenusOrder;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenusDao {

    @Select("select * from menus order by m_id")
    List<Menus> selectMenus();
}
