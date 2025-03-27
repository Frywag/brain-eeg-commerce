package com.braincommerce.common.exception;

import lombok.Getter;

/**
 * 应用程序异常的基类
 */
@Getter
public class BaseException extends RuntimeException {

    private final String errorCode;
    private final transient Object[] args;

    public BaseException(String message) {
        this("SYSTEM_ERROR", message);
    }

    public BaseException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.args = new Object[0];
    }

    public BaseException(String errorCode, String message, Object... args) {
        super(message);
        this.errorCode = errorCode;
        this.args = args;
    }

    public BaseException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.args = new Object[0];
    }
}
