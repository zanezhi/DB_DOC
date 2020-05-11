package com.example.db.mysql.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.config.Result;
import com.example.db.mysql.dto.TableDto;
import com.example.db.mysql.service.impl.MySqlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: MySqlController
 * @Description: TODO
 * @author: xu.zhi
 * @version: 1.0
 * @date: 2020/5/9 15:03
 */
@Controller
@RequestMapping("mysql")
public class MySqlController {

    @Autowired
    private MySqlServiceImpl mySqlService;

    @RequestMapping()
    public String mysqlIndex(){
        return "mysql/mysqlManager";
    }

    @PostMapping("/columns")
    @ResponseBody
    public Result columns(@RequestParam("pageNum") Integer pageNum,
                          @RequestParam("pageSize") Integer pageSize,TableDto table){
        Page page = new Page(pageNum, pageSize);
        return Result.page(mySqlService.getColumns(page,table));

    }

}
