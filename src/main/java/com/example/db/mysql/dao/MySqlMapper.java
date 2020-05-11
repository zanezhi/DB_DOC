package com.example.db.mysql.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.db.mysql.dto.TableDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Title: MySqlMapper
 * @Description: TODO
 * @author: xu.zhi
 * @version: 1.0
 * @date: 2020/5/9 15:20
 */
@Repository
public interface MySqlMapper {

    IPage<TableDto> getColumns(Page page, @Param("tableDto") TableDto tableDto);
}
