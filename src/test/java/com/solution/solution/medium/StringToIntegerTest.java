package com.solution.solution.medium;

import com.solution.general.StringToInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class StringToIntegerTest {

    @Spy
    StringToInteger stringToInteger;

    @Test
    public void myAtoi() {
        assertThat(stringToInteger.myAtoi(" ")).isEqualTo(0);
    }
}