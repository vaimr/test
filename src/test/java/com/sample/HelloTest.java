package com.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testGetMessage() {
        assertEquals("Hello name", new Hello("name").getMessage());
    }
}
