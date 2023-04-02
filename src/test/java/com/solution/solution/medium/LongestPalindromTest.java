package com.datastructures.solution.medium;

import org.junit.Before;
import org.junit.Test;

public class LongestPalindromTest {

    LongestPalindrom longestPalindrom;
    @Before
    public void setUp() throws Exception {
        longestPalindrom = new LongestPalindrom();
    }

    @Test
    public void longestPalindrome() {
        System.out.println(longestPalindrom.longestPalindrome("bb"));
        System.out.println(longestPalindrom.longestPalindrome("babad"));
        System.out.println(longestPalindrom.longestPalindrome("ccc"));
    }
}