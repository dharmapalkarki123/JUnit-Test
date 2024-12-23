package com.intern.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.intern.service.Rectangle;

class RectangleTest {

	@Test
    void testValidPerimeter() throws Exception {
        // Valid input case
        assertEquals(20, Rectangle.perimeter(5, 5));
    }

    @Test
    void testUndefinedLength() {
        // Length is undefined
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter(null, 5));
        assertEquals("Undefined", exception.getMessage());
    }

    @Test
    void testUndefinedBreadth() {
        // Breadth is undefined
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter(5, null));
        assertEquals("Undefined", exception.getMessage());
    }

    @Test
    void testLengthNotANumber() {
        // Length is not a number
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter("five", 5));
        assertEquals("Not a number", exception.getMessage());
    }

    @Test
    void testBreadthNotANumber() {
        // Breadth is not a number
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter(5, "five"));
        assertEquals("Not a number", exception.getMessage());
    }

    @Test
    void testNegativeLength() {
        // Length is negative
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter(-5, 5));
        assertEquals("dimension cannot be negative", exception.getMessage());
    }

    @Test
    void testNegativeBreadth() {
        // Breadth is negative
        Exception exception = assertThrows(Exception.class, () -> Rectangle.perimeter(5, -5));
        assertEquals("dimension cannot be negative", exception.getMessage());
    }
}
