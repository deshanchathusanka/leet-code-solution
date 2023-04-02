package com.solution.general;

public class StringToInteger {
    public int myAtoi(String s) {
        int converted_val = 0;
        boolean isValidChar = false;
        boolean start = false;
        int startIndex = 0;
        String processedStr = s;
        char[] chars = processedStr.toCharArray();
        int end = processedStr.length()-1;

        for (int index = 0; index<chars.length; ++index)
        {
            if(!start)
            {
                if(chars[index]==' ')
                {
                    continue;
                }
                start = true;
                startIndex = index;
                end = index;
                isValidChar = (chars[index]>='0' && chars[index]<='9') || chars[index]=='-' || chars[index]=='+';
                if(isValidChar)
                {
                    continue;
                }else
                {
                    return 0;
                }
            }

            isValidChar = (chars[index]>='0' && chars[index]<='9');
            if(isValidChar)
            {
                end = index;
            }else
            {
                break;
            }
        }
        processedStr = processedStr.substring(startIndex, end+1);
        processedStr = processedStr.replace(" ","");

        if("+".equals(processedStr) || "-".equals(processedStr))
        {
            return 0;
        }

        try{
            converted_val = Integer.parseInt(processedStr);
        }catch (NumberFormatException e)
        {
            if(processedStr.isEmpty())
            {
                converted_val = 0;
            }
            else if(processedStr.toCharArray()[0]=='-')
            {
                converted_val = Integer.MIN_VALUE;
            } else {
                converted_val = Integer.MAX_VALUE;
            }
        }

        return converted_val;
    }
}
