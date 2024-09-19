package com.HTShop.message_service.exception;

public class AppException extends Exception {
    private ErrorCode errorCode;

    public AppException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    public ErrorCode getErrorCode() {return errorCode;}
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
