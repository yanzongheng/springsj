package com.a.impl;

import com.a.dao.TableDao;
import com.a.entity.Table;
import com.a.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableDao tableDao;

    @Override
    public List<Table> selectTable() {

        return tableDao.selectTable();
    }

    @Override
    public void updateTableYes() {
        tableDao.updateTableYes();
    }

    @Override
    public void updateTableNo() {
        tableDao.updateTableNo();

    }
}
