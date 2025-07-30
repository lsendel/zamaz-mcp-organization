package com.zamaz.mcp.organization.infrastructure.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class McpErrorResponse {
    private String errorCode;
    private String message;
    private String details;
    private Instant timestamp;
    private String path;
}