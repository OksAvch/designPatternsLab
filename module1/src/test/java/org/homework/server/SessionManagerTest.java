package org.homework.server;

import org.homework.server.entity.Session;
import org.homework.server.entity.User;
import org.homework.server.exception.InsufficientRightsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SessionManagerTest {
    SessionManager sut = new SessionManager();

    @Test
    void shouldReturnSession() throws InsufficientRightsException {
        String user = "user1";
        String resource = "folder1";
        Session actualResult = sut.createSession(new User(user), resource);

        assertEquals(user, actualResult.getUserName());
    }

    @Test
    void shouldFail_ifUserIsAbsent(){
        String user = "userN";
        String resource = "folder1";

        assertThrows(InsufficientRightsException.class, () -> sut.createSession(new User(user), resource));
    }

    @Test
    void shouldFail_ifResourceIsAbsent(){
        String user = "user1";
        String resource = "folderN";

        assertThrows(InsufficientRightsException.class, () -> sut.createSession(new User(user), resource));
    }

    @Test
    void shouldFail_ifAccessLevelIsNotEnough(){
        String user = "user1";
        String resource = "folder2";

        assertThrows(InsufficientRightsException.class, () -> sut.createSession(new User(user), resource));
    }

}