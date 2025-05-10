package com.djx.yunpicturebackend.common;

import com.djx.yunpicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局响应封装类
 *
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String massage;

    private static final long serialVersionUID = 1;

    public BaseResponse(int code, T data, String massage) {
        this.code = code;
        this.data = data;
        this.massage = massage;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
