package org.homework.server;

import org.homework.server.entity.AccessLevel;
import org.homework.server.entity.User;

import java.util.Optional;

public class AccessChecker {
    private static AccessChecker instance;

    private final ServerConfig config = ServerConfig.getInstance();

    private AccessChecker() {
    }

    public static AccessChecker getInstance() {
        if (instance == null) {
            instance = new AccessChecker();
        }
        return instance;
    }

    public boolean mayAccess(User user, String path) {
        Optional<AccessLevel> userLevel = config.getUserAccessLevel(user);
        Optional<AccessLevel> resourceLevel = config.getResourceAccessLevel(path);

        if(userLevel.isEmpty() || resourceLevel.isEmpty())
            return  false;

        return isUserAndResourceLevelMatch(userLevel.get(), resourceLevel.get());
    }

    private boolean isUserAndResourceLevelMatch(AccessLevel userLevel, AccessLevel resourceLevel) {
        return userLevel.getLevel() >= resourceLevel.getLevel();
    }

}
