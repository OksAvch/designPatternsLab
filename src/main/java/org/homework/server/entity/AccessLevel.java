package org.homework.server.entity;

import lombok.Getter;

@Getter
public enum AccessLevel {
    L1(1), L2(2), L3(3);

    private final int level;

    AccessLevel(int level) {
        this.level = level;
    }
}
