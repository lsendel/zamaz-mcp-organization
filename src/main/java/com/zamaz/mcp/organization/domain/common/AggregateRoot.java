package com.zamaz.mcp.organization.domain.common;

import java.io.Serializable;

public abstract class AggregateRoot<ID extends Serializable> extends DomainEntity<ID> {
    
    public AggregateRoot() {
        super();
    }
}