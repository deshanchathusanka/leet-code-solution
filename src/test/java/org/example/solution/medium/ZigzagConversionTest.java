package org.example.solution.medium;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ZigzagConversionTest {
    ZigzagConversion zigzagConversion;

    @Before
    public void setUp() throws Exception {
        zigzagConversion = Mockito.spy(new ZigzagConversion());
    }

    @Test
    public void convert() {
        assertEquals("PINALSIGYAHRPI", zigzagConversion.convert("PAYPALISHIRING",4));
        assertEquals("PAYPALISHIRING", zigzagConversion.convert("PAYPALISHIRING",1));
    }
}