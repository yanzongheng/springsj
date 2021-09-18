package com.a.dao;

import com.a.entity.Table;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TableDao {
    @Select("select * from _table")
    List<Table> selectTable();

    @Update("update _table set t_status = '1' where t_id = #{s}")
    void updateTableYes(@Param("s") String s);


}
