package org.homework.server.exception;

import org.homework.server.entity.User;

public class InsufficientRightsException extends Exception {
    public InsufficientRightsException(User user, String accessedPath) {
        super(String.format("User '%s' has no rights to access requested resource '%s'", user.getName(), accessedPath));
    }
}
