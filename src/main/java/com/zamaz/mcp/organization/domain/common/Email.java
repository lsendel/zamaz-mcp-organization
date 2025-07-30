package com.zamaz.mcp.organization.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.regex.Pattern;

@Embeddable
@Getter
@NoArgsConstructor
public class Email extends ValueObject {
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})$"
    );
    
    @Column(name = "email")
    private String value;
    
    public Email(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new IllegalArgumentException("Invalid email format: " + value);
        }
        this.value = value.toLowerCase().trim();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
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