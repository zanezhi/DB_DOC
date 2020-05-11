package com.example.common.config;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.common.constant.Message;


import java.io.Serializable;


/**
 *
 */
public class Result implements Serializable {
    private long count;
    private Object data;
    private long code;
    private String message;
    private Object obj;

    private Result() {
        this.code = Message.SystemStatus.SUCCESS.getCode();
        this.message = Message.SystemStatus.SUCCESS.getMessage();
    }

    private Result(Message statusMessage) {
        this.code = statusMessage.getCode();
        this.message = statusMessage.getMessage();
    }

    public static Result page(IPage page) {
        Result result = new Result();
        result.count = page.getTotal();
        result.data = page.getRecords();
        return result;
    }


    public static Result success(Object obj) {
        Result result = new Result();
        result.data = obj;
        return result;
    }

    public static Result error(Message statusMessage) {
        return new Result(statusMessage);
    }

    public static Result error(long code, String message) {
        Result result = new Result();
        result.code = code;
        result.message = message;
        return result;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
