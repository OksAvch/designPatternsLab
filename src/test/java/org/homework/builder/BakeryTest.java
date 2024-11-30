package org.homework.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BakeryTest {

    @Test
    void produceBirthdayCake() {
        Bakery bakery = new Bakery();
        Cake expected = new Cake("white cream", "chocolate", "sparkles");
        assertEquals(expected.toString(), bakery.produceBirthdayCake().toString());
    }
}