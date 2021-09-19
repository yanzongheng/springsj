package com.a.dao;

import com.a.entity.Menus;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenusDao {

    @Select("select * from menus")
    List<Menus> selectMenus();
}
