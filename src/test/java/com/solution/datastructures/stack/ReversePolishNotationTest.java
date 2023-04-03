package com.solution.datastructures.stack;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class ReversePolishNotationTest {

    @Spy
    ReversePolishNotation reversePolishNotation;

    @Test
    void evalRPN_case_1() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        assertThat(reversePolishNotation.evalRPN(tokens)).isEqualTo(6);
    }

    @Test
    void evalRPN_case_2() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertThat(reversePolishNotation.evalRPN(tokens)).isEqualTo(22);
    }
}