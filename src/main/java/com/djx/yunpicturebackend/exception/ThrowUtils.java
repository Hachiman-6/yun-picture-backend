package com.djx.yunpicturebackend.exception;

public class ThrowUtils {

    /**
     * 条件成立则抛异常
     *
     * @param condition        条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition 条件
     * @param errorCode 自定义状态码
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition 条件
     * @param errorCode 自定义状态码
     * @param massage   错误信息
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String massage) {
        throwIf(condition, new BusinessException(errorCode, massage));
    }
}
