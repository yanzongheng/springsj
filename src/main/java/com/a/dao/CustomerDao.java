package com.a.dao;

import com.a.entity.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDao {
    @Insert("insert into customer value (#{c_Name},#{c_Sex},#{c_Tel},#{c_Id},#{c_Table})")
    void insertCustomer(Customer customer);

    @Delete("delete from customer where c_id=#{c_Id}")
    void deleteCustomer(Integer integer);

    @Select("select * from customer")
    List<Customer> selectCustomer();

}
