package com.example.demo.exception;

/**
 * Created by Vito Zhuang on 1/2/2019.
 */
public class ModuleAException extends RuntimeException {

    public ModuleAException() {
        super();
    }

    public ModuleAException(String message) {
        super(message);
    }

    public ModuleAException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModuleAException(Throwable cause) {
        super(cause);
    }

    protected ModuleAException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
