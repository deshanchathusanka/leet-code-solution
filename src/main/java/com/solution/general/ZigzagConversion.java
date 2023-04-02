package com.solution.general;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        String zigzagStr = "";
        char[] originalCharArray = s.toCharArray();
        char[][] zigzagCharArray = new char[numRows][1000];
        boolean down = true;
        int x = 0, y = 0;

        for (char c : originalCharArray)
        {
            zigzagCharArray[x][y] = c;
            if(down)
            {
                if(x<numRows-1)
                {
                    ++x;
                } else if (numRows == 1) {
                    ++y;
                } else
                {
                    down = false;
                    --x;
                    ++y;
                }
            }else
            {
                if(x>0)
                {
                    --x;
                    ++y;
                }else
                {
                    down = true;
                    ++x;
                }
            }
        }

        StringBuilder stringBuilder=new StringBuilder();

        for (char[] chars:zigzagCharArray)
        {
            zigzagStr = String.valueOf(chars);
            zigzagStr = zigzagStr.replace("\0","");
            stringBuilder.append(zigzagStr);
        }
        zigzagStr = stringBuilder.toString();
        return zigzagStr;
    }
}
