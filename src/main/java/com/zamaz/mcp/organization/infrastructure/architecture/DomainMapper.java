package com.zamaz.mcp.organization.infrastructure.architecture;

public interface DomainMapper<D, E> {
    E toEntity(D domain);
    D toDomain(E entity);
}