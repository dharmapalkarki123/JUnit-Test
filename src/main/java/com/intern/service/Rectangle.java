package com.intern.service;

public class Rectangle {

    public static int perimeter(Object length, Object breadth) throws Exception {
        //  if length or breadth is null
        if (length == null || breadth == null) {
            throw new Exception("Undefined");
        }

        // if length is a number
        if (!(length instanceof Number)) {
            throw new Exception("Not a number");
        }

        //  if breadth is a number
        if (!(breadth instanceof Number)) {
            throw new Exception("Not a number");
        }

        //  if length or breadth is negative
        if (((Number) length).doubleValue() < 0 || ((Number) breadth).doubleValue() < 0) {
            throw new Exception("dimension cannot be negative");
        }

        // Calculate and return the perimeter
        return 2 * (((Number) length).intValue() + ((Number) breadth).intValue());
    }
}
