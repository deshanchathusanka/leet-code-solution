package com.solution.string;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        Map<Integer, String> digitMap = Map.of(2, "abc",
                3, "def",
                4, "ghi",
                5, "jkl",
                6, "mno",
                7, "pqrs",
                8, "tuv",
                9, "wxyz");

        List<String> input = new ArrayList<>();
        for (char ch : digits.toCharArray()) {
            String str = digitMap.get(Character.getNumericValue(ch));
            input.add(str);
        }

        merge(input, combinations);
        return combinations.stream().toList();
    }

    void merge(List<String> input, List<String> combinations) {
        boolean merge = true;
        boolean previousOne = true;

        for (int index = 0; index < input.size(); ++index) {
            String str = input.get(index);
            if (str.length() > 1 && previousOne) {
                List<String> temp = new ArrayList<>(input);
                for (char ch : str.toCharArray()) {
                    temp.set(index, Character.toString(ch));
                    merge(temp, combinations);
                }
                merge = false;
                previousOne = false;
            }
        }

        if (merge && !input.isEmpty()) {
            String joinedStr = String.join("", input);
            combinations.add(joinedStr);
        }
    }
}
