package org.homework.server.entity;

import java.util.Map;

public class ConfigData {
    Map<String, AccessLevel> usersAccess;
    Map<String, AccessLevel> resourcesAccess;

    public Map<String, AccessLevel> getUsersAccess() {
        return usersAccess;
    }

    public Map<String, AccessLevel> getResourcesAccess() {
        return resourcesAccess;
    }
}
