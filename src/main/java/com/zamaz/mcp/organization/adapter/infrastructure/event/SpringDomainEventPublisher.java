package com.zamaz.mcp.organization.adapter.infrastructure.event;

import com.zamaz.mcp.organization.domain.event.common.DomainEvent;
import com.zamaz.mcp.organization.domain.event.common.DomainEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Spring implementation of DomainEventPublisher.
 * Uses Spring's ApplicationEventPublisher to publish domain events.
 */
@Component
@RequiredArgsConstructor
public class SpringDomainEventPublisher implements DomainEventPublisher {
    
    private final ApplicationEventPublisher applicationEventPublisher;
    
    @Override
    public void publish(DomainEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
    
    @Override
    public void publishAll(List<DomainEvent> events) {
        events.forEach(this::publish);
    }
}