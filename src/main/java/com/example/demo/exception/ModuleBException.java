package com.example.demo.exception;

/**
 * Created by Vito Zhuang on 1/2/2019.
 */
public class ModuleBException extends RuntimeException {

    public ModuleBException() {
        super();
    }

    public ModuleBException(String message) {
        super(message);
    }

    public ModuleBException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModuleBException(Throwable cause) {
        super(cause);
    }

    protected ModuleBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
