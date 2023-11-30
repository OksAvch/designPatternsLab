package org.homework.printer.entity;

import org.homework.server.entity.AccessLevel;

public record User(String name, AccessLevel accessLevel, boolean isMonthEmployee) {
}
