package com.solution.solution.medium;

import com.solution.general.ReserveInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ReserveIntegerTest {

    @Spy
    ReserveInteger reserveInteger;

    @Test
    public void reverse() {
        assertThat(reserveInteger.reverse(-765)).isEqualTo(-567);
        assertThat(reserveInteger.reverse(1534236469)).isEqualTo(0);
    }

}