package com.a.service;

import com.a.entity.Table;

import java.util.List;

public interface TableService {

    List<Table> selectTable();
    void updateTableYes(String s);

}
