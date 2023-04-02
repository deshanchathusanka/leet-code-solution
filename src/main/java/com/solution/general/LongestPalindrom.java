package com.datastructures.solution.medium;

public class LongestPalindrom {
    public String longestPalindrome(String s) {
        String palindrom_str = s.substring(0, 1);
        String temp_str = "";
        int origin = 1;
        char[] char_array = s.toCharArray();

        while (origin<s.length())
        {
            if ((origin+1 < s.length()) && (char_array[origin+1] == char_array[origin-1]))
            {
                for(int offset = 1; (origin+offset)<s.length() && origin-offset>=0;++offset)
                {
                    if(char_array[origin+offset]!=char_array[origin-offset])
                    {
                        break;
                    }else
                    {
                        temp_str = s.substring(origin-offset, origin+offset+1);
                        if(temp_str.length()>palindrom_str.length())
                        {
                            palindrom_str = temp_str;
                        }
                    }
                }
            }
            if(char_array[origin]==char_array[origin-1])
            {
                for(int offset = 1; (origin+offset-1)<s.length() && origin-offset>=0;++offset)
                {
                    if(char_array[origin+offset-1]!=char_array[origin-offset])
                    {
                        break;
                    }else {
                        temp_str = s.substring(origin-offset, origin+offset);
                        if(temp_str.length()>palindrom_str.length())
                        {
                            palindrom_str = temp_str;
                        }
                    }
                }
            }
            ++origin;
        }
        return palindrom_str;
    }
}
