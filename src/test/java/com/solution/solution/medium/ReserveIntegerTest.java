package com.solution.solution.medium;

import com.solution.general.ReserveInteger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

public class ReserveIntegerTest {

    ReserveInteger reserveInteger;

    @Before
    public void setUp() throws Exception {
        reserveInteger = Mockito.spy(new ReserveInteger());
    }

    @Test
    public void reverse() {
//        doReturn(432)
//                .when(reserveInteger)
//                        .reverse(anyInt());
        assertEquals(-567, reserveInteger.reverse(-765));
        assertEquals(0, reserveInteger.reverse(1534236469));
    }

}