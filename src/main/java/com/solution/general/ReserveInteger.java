package com.solution.general;

public class ReserveInteger {
    public int reverse(int x) {
        String int_str = Integer.toString(x);
        String reserved_str = "";
        int sign = 1;
        if(x<0)
        {
            sign = -1;
            int_str = int_str.substring(1);
        }
        reserved_str = reverseString(int_str);

        try {
            return sign*Integer.parseInt(reserved_str);
        }catch (NumberFormatException e)
        {
            return 0;
        }

    }

    private String reverseString(String str)
    {
        char[] original_array = str.toCharArray();
        char[] reversed_array = new char[original_array.length];
        for(int index=0; index < original_array.length; ++index)
        {
            reversed_array[index] = original_array[original_array.length-1-index];
        }
        return String.valueOf(reversed_array);
    }
}
