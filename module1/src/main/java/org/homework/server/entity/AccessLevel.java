package org.homework.server.entity;

public enum AccessLevel {
    L1(1), L2(2), L3(3);

    final int level;

    AccessLevel(int level) {
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }
}
