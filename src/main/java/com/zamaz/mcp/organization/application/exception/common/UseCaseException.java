package com.zamaz.mcp.organization.application.exception.common;

public class UseCaseException extends RuntimeException {
    
    public UseCaseException(String message) {
        super(message);
    }
    
    public UseCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}