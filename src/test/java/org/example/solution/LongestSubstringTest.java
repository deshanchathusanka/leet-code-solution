package org.example.solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {
    LongestSubstring longestSubstring;
    @Before
    public void setUp() throws Exception {
        longestSubstring = new LongestSubstring();
    }

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(longestSubstring.lengthOfLongestSubstring(" "));
    }
}