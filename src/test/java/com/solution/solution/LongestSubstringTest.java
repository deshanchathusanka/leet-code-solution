package com.solution.solution;

import com.solution.general.LongestSubstring;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LongestSubstringTest {

    @Spy
    LongestSubstring longestSubstring;

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(longestSubstring.lengthOfLongestSubstring(" "));
    }
}