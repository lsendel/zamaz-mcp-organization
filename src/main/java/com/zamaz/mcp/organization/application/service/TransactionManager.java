package com.zamaz.mcp.organization.application.service;

import java.util.function.Supplier;

public interface TransactionManager {
    <T> T executeInTransaction(Supplier<T> action);
    void executeInTransaction(Runnable action);
}