package org.homework.server.entity;

import java.util.Map;

public record ConfigData(
        Map<String, AccessLevel> usersAccess,
        Map<String, AccessLevel> resourcesAccess) {
}
