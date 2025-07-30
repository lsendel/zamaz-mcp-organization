package com.zamaz.mcp.organization.domain.common;

import java.io.Serializable;

public abstract class ValueObject implements Serializable {
    
    @Override
    public abstract boolean equals(Object o);
    
    @Override
    public abstract int hashCode();
    
    @Override
    public abstract String toString();
}