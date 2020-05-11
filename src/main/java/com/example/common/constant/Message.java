package com.example.common.constant;

/**
 * @Title: Message
 * @Description: 响应状态信息
 */
public interface Message {

    long getCode();

    String getMessage();

    public enum SystemStatus implements Message {

        SUCCESS(0, "SUCCESS"),   //请求成功
        ERROR(404, "ERROR"),       //请求失败
        PARAM_ERROR(1002, "PARAM_ERROR"), //请求参数有误
        SUCCESS_MATCH(1003, "SUCCESS_MATCH"); //表示成功匹配
        private long code;
        private String message;

        private SystemStatus(long code, String message) {
            this.code = code;
            this.message = message;
        }

        public long getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }

}
