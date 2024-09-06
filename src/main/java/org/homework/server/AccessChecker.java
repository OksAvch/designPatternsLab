package org.homework.server;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.homework.server.entity.AccessLevel;
import org.homework.server.entity.User;

@Slf4j
public class AccessChecker {
    private static AccessChecker instance;

    private final ServerConfig config = ServerConfig.getInstance();

    private AccessChecker() {
    }

    //thread save singleton Option 2
    public static AccessChecker getInstance() {
        if (instance == null) {
            synchronized (AccessChecker.class) {
                if (instance == null) {
                    instance = new AccessChecker();  // if instance is still null, initialize
                }
                return instance;
            }
        }
        return instance;
    }

    public boolean mayAccess(User user, String path) {
        Optional<AccessLevel> userLevel = config.getUserAccessLevel(user);
        Optional<AccessLevel> resourceLevel = config.getResourceAccessLevel(path);

        if (userLevel.isEmpty() || resourceLevel.isEmpty()) {
            log.debug("Required access level information was not found");
            return false;
        }

        return isUserAndResourceLevelMatch(userLevel.get(), resourceLevel.get());
    }

    private boolean isUserAndResourceLevelMatch(AccessLevel userLevel, AccessLevel resourceLevel) {
        return userLevel.getLevel() >= resourceLevel.getLevel();
    }

}
