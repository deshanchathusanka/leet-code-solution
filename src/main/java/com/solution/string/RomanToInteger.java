package com.solution.string;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.*;

public class RomanToInteger {
    private static Map<Character, Integer> pureRomanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    private static Map<String, Integer> combinedRomanMap = Map.of(
            "IV", 4,
            "IX", 9,
            "XL", 40,
            "XC", 90,
            "CD", 400,
            "CM", 900
    );
    private static List<Character> specialRomanChar = List.of('I', 'X', 'C');
    public int romanToInt(String s) {
        CharacterIterator characterIterator = new StringCharacterIterator(s);
        int integer = 0;
        boolean isCombined;
        while (characterIterator.current() != CharacterIterator.DONE) {
            isCombined = false;
            char current = characterIterator.current();
            if (specialRomanChar.contains(current)) {
                char next = characterIterator.next();
                String cmbKey = new StringBuilder()
                        .append(current)
                        .append(next)
                        .toString();
                Optional<Integer> combinedIntValue = Optional.ofNullable(combinedRomanMap.get(cmbKey));
                if (combinedIntValue.isPresent()) {
                    integer += combinedIntValue.get();
                    isCombined = true;
                } else {
                    characterIterator.previous();
                }
            }

            if (!isCombined) {
                integer += pureRomanMap.get(current);
            }
            characterIterator.next();
        }

        return integer;
    }
}
