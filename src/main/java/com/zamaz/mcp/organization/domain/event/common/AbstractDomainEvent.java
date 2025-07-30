package com.zamaz.mcp.organization.domain.event.common;

import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
public abstract class AbstractDomainEvent implements DomainEvent {
    
    private final String eventId;
    private final String aggregateId;
    private final Instant occurredOn;
    private final String eventType;
    
    protected AbstractDomainEvent(String aggregateId) {
        this.eventId = UUID.randomUUID().toString();
        this.aggregateId = aggregateId;
        this.occurredOn = Instant.now();
        this.eventType = this.getClass().getSimpleName();
    }
}