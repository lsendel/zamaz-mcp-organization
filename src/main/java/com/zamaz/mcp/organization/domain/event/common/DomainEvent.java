package com.zamaz.mcp.organization.domain.event.common;

import java.time.Instant;

public interface DomainEvent {
    String getAggregateId();
    Instant getOccurredOn();
    String getEventType();
}