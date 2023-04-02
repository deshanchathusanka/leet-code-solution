package com.datastructures.solution.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class StringToIntegerTest {

    @Spy
    StringToInteger stringToInteger;

    @Test
    public void myAtoi() {
//        assertEquals(4193,stringToInteger.myAtoi("4193 with words"));
//        assertEquals(0,stringToInteger.myAtoi("   +0 123"));
//        assertEquals(0,stringToInteger.myAtoi("words and 987"));
//        assertEquals(2147483647,stringToInteger.myAtoi("20000000000000000000"));
//        assertEquals(42,stringToInteger.myAtoi("42"));
//        assertEquals(3,stringToInteger.myAtoi("3.14159"));
//        assertEquals(0,stringToInteger.myAtoi("+-12"));
//        assertEquals(0,stringToInteger.myAtoi(""));
        assertEquals(0,stringToInteger.myAtoi(" "));
    }
}