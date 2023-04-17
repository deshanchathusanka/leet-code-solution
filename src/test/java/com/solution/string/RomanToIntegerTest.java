package com.solution.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RomanToIntegerTest {

    @Spy
    RomanToInteger romanToInteger;

    @ParameterizedTest
    @CsvSource(value = {"III:3",
            "LVIII:58",
            "MCMXCIV:1994"}, delimiter = ':')
    void romanToInt(String roman, Integer integer) {
        assertThat(romanToInteger.romanToInt(roman)).isEqualTo(integer);
    }
}