package com.solution.solution.medium;

import com.solution.general.ZigzagConversion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
public class ZigzagConversionTest {
    @Spy
    ZigzagConversion zigzagConversion;

    @Test
    public void convert() {
        assertThat(zigzagConversion.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
        assertThat(zigzagConversion.convert("PAYPALISHIRING", 1)).isEqualTo("PAYPALISHIRING");
    }
}