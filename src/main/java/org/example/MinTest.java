package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinTest {
    @Test
    public void testPositive() {
        int out = Min.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = Min.min(-1, -2);
        assertEquals(-2, out);
    }
}
