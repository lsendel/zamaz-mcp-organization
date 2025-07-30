package com.zamaz.mcp.organization.infrastructure.security;

public class McpSecurityContext {
    
    private static final ThreadLocal<String> currentUser = new ThreadLocal<>();
    
    public static void setCurrentUser(String userId) {
        currentUser.set(userId);
    }
    
    public static String getCurrentUser() {
        return currentUser.get();
    }
    
    public static void clear() {
        currentUser.remove();
    }
}