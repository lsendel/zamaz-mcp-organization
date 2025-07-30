package com.zamaz.mcp.organization.infrastructure.logging;

public interface DomainLoggerFactory {
    DomainLogger getLogger(Class<?> clazz);
    DomainLogger getLogger(String name);
}