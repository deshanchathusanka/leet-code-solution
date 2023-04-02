package com.solution.general;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String max_sub_srt = "";
        String temp_sub_srt = "";
        int start_index = 0;
        int offset = 1;

        while((start_index + max_sub_srt.length())<s.length())
        {
            do {
                if((start_index+offset)>s.length())
                {
                    break;
                }
                temp_sub_srt = s.substring(start_index, start_index + offset);
                if (!isUnique(temp_sub_srt)) {
                    break;
                }
                if (temp_sub_srt.length() > max_sub_srt.length()) {
                    max_sub_srt = temp_sub_srt;
                }
                ++offset;
            }while (true);
            ++start_index;
            --offset;

        }
        return max_sub_srt.length();
    }

    private boolean isUnique(String s)
    {
        HashSet<Character> unique_chars=new HashSet<>();
        char[] sorted_char_array = s.toCharArray();
        Arrays.sort(sorted_char_array);
        for (Character character:sorted_char_array)
        {
            if(!unique_chars.add(character))
            {
                return false;
            }
        }
        return true;
    }
}
