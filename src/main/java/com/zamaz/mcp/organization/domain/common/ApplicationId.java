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
public class ApplicationId extends ValueObject {
    
    @Column(name = "application_id")
    private String value;
    
    public ApplicationId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("ApplicationId cannot be null or empty");
        }
        this.value = value;
    }
    
    public static ApplicationId generate() {
        return new ApplicationId(UUID.randomUUID().toString());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationId that = (ApplicationId) o;
        return Objects.equals(value, that.value);
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