package com.zamaz.mcp.organization.domain.event.common;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}