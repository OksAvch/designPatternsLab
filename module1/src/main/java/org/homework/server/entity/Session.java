package org.homework.server.entity;

public class Session {
    private String userName;

    public Session(User user) {
        this.userName = user.getName();
    }

    public String getUserName() {
        return userName;
    }
}
