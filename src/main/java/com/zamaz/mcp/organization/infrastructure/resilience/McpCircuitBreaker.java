package com.zamaz.mcp.organization.infrastructure.resilience;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class McpCircuitBreaker {
    
    public <T> T executeWithFallback(Supplier<T> supplier, Supplier<T> fallback) {
        try {
            return supplier.get();
        } catch (Exception e) {
            return fallback.get();
        }
    }
    
    public void execute(Runnable action) {
        try {
            action.run();
        } catch (Exception e) {
            // Circuit breaker logic
        }
    }
}