package org.homework.printer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.homework.printer.entity.User;
import org.homework.server.entity.AccessLevel;
import org.junit.jupiter.api.Test;

class PrinterImplTest {
    private final BadgePrinter sut = new BadgePrinterImpl();

    @Test
    void shouldGenerateLevel1Badge() {
        String result = sut.printUserBadge(new User("Bob", AccessLevel.L3, true));
        assertEquals("==== THIS MONTH BEST 'Senior manager Bob' ====", result);
    }

}