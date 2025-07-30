package com.zamaz.mcp.organization.infrastructure.security;

import com.zamaz.mcp.organization.domain.model.User;

import java.util.Optional;

public interface UserLookupService {
    Optional<User> findByEmail(String email);
    Optional<User> findById(String userId);
}