package com.a.dao;

import com.a.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

    @Insert("insert into _order value (#{o_Id},#{o_T_Id},#{o_E_Id},#{o_Time},#{o_Price})")
    void insertOrder(Order customer);

    int sumPrice(@Param("o_Id") Integer o_Id);


    @Select("select * from _order")
    List<Order> selectOrder();

}
