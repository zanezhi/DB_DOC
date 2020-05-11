package com.example.db.mysql.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.db.mysql.dao.MySqlMapper;
import com.example.db.mysql.dto.TableDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title: MySqlServiceImpl
 * @Description: TODO
 * @author: xu.zhi
 * @version: 1.0
 * @date: 2020/5/9 15:08
 */
@Service
public class MySqlServiceImpl {

    @Autowired
    private MySqlMapper mySqlMapper;

    public IPage<TableDto> getColumns(Page<TableDto> page, TableDto table) {
        return mySqlMapper.getColumns(page,table);
    }
}
