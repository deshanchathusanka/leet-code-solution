package com.datastructures.solution.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ZigzagConversionTest {
    @Spy
    ZigzagConversion zigzagConversion;

    @Test
    public void convert() {
        assertEquals("PINALSIGYAHRPI", zigzagConversion.convert("PAYPALISHIRING",4));
        assertEquals("PAYPALISHIRING", zigzagConversion.convert("PAYPALISHIRING",1));
    }
}