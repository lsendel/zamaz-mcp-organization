package com.zamaz.mcp.organization.infrastructure.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class McpErrorHandler {
    
    public void handleError(Exception e) {
        // Error handling logic
    }
    
    public void logError(String message, Exception e) {
        // Error logging logic
    }
    
    public ResponseEntity<McpErrorResponse> createErrorResponse(Exception e, String message, HttpStatus status) {
        McpErrorResponse errorResponse = new McpErrorResponse(
            e.getClass().getSimpleName(),
            message,
            e.getMessage(),
            Instant.now(),
            null
        );
        return ResponseEntity.status(status != null ? status : HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}