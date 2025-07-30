package com.zamaz.mcp.organization.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@NoArgsConstructor
public class TeamId extends ValueObject {
    
    @Column(name = "team_id")
    private String value;
    
    public TeamId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("TeamId cannot be null or empty");
        }
        this.value = value;
    }
    
    public static TeamId generate() {
        return new TeamId(UUID.randomUUID().toString());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamId teamId = (TeamId) o;
        return Objects.equals(value, teamId.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    
    @Override
    public String toString() {
        return value;
    }
}