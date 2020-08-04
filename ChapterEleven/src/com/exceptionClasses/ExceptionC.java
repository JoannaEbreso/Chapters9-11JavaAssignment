package com.exceptionClasses;

public class ExceptionC extends ExceptionB {
    public ExceptionC() {
    }

    public ExceptionC(String message) {
        super(message);
    }

    public ExceptionC(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionC(Throwable cause) {
        super(cause);
    }

    public ExceptionC(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
