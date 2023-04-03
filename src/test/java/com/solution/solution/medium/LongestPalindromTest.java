package com.solution.solution.medium;

import com.solution.general.LongestPalindrom;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LongestPalindromTest {

    @Spy
    LongestPalindrom longestPalindrom;

    @Test
    public void longestPalindrome() {
        System.out.println(longestPalindrom.longestPalindrome("bb"));
        System.out.println(longestPalindrom.longestPalindrome("babad"));
        System.out.println(longestPalindrom.longestPalindrome("ccc"));
    }
}