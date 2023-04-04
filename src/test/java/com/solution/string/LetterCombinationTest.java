package com.solution.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LetterCombinationTest {

    @Spy
    LetterCombination letterCombination;

    @Test
    void letterCombinations() {
        System.out.println(letterCombination.letterCombinations("22"));
    }

    @Test
    void combine() {
        List<String> combinations = new ArrayList<>();
        List<String> input = List.of("abc","def");
        letterCombination.merge(input,combinations);
        System.out.println(combinations);
    }
}