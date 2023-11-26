package org.homework.server;

import org.homework.server.entity.Session;
import org.homework.server.entity.User;
import org.homework.server.exception.InsufficientRightsException;

public class SessionManager {
    private final AccessChecker access = AccessChecker.getInstance();

    public Session createSession(User user, String accessedPath) throws InsufficientRightsException {
        if (access.mayAccess(user, accessedPath)) {
            return new Session(user);
        } else {
            throw new InsufficientRightsException(user, accessedPath);
        }
    }

}
