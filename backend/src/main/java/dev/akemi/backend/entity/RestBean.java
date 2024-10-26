package dev.akemi.backend.entity;

import lombok.Data;

@Data
public class RestBean<T> {

    private int code;
    private String message;
    private T data;
    private long timestamp;

    public RestBean() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> RestBean<T> success() {
        RestBean<T> result = new RestBean<T>();
        result.setCode(200);
        result.setMessage("请求成功");
        return result;
    }

    public static <T> RestBean<T> success(T data) {
        RestBean<T> result = success();
        result.setData(data);
        return result;
    }

    public static <T> RestBean<T> failure(int code, String message) {
        RestBean<T> result = new RestBean<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}

