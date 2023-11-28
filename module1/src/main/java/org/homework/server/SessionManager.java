package org.homework.server;

import lombok.extern.slf4j.Slf4j;
import org.homework.server.entity.Session;
import org.homework.server.entity.User;
import org.homework.server.exception.InsufficientRightsException;

@Slf4j
public class SessionManager {
    private final AccessChecker access = AccessChecker.getInstance();

    public Session createSession(User user, String accessedPath)
            throws InsufficientRightsException {

        log.debug("Access to {} resource is requested", accessedPath);
        if (access.mayAccess(user, accessedPath)) {
            return new Session(user.name());
        } else {
            throw new InsufficientRightsException(user, accessedPath);
        }
    }

}
