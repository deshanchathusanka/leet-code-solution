package com.solution.solution;

import com.solution.general.LongestSubstring;
import org.junit.Before;
import org.junit.Test;

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