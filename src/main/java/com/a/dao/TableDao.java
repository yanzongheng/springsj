package com.a.dao;

import com.a.entity.Table;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TableDao {
    @Select("select * from _table")
    List<Table> selectTable();

    @Update("update _table set t_status = 'yes' where t_id in (select c_table from customer)")
    void updateTableYes();
    @Update("update _table set t_status = 'no' where t_id not in (select c_table from customer)")
    void updateTableNo();

}
