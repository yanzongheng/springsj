package com.a.impl;

import com.a.dao.TableDao;
import com.a.entity.Table;
import com.a.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TableServiceImpl implements TableService {

    @Autowired
    private TableDao tableDao;

    @Override
    public List<Table> selectTable() {

        return tableDao.selectTable();
    }

    @Override
    public void updateTableYes(String s) {
        tableDao.updateTableYes(s);
    }


}
