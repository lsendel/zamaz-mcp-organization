package com.zamaz.mcp.organization.application.service;

import java.util.List;
import java.util.Map;

public interface ValidationService {
    Map<String, List<String>> validate(Object object);
}