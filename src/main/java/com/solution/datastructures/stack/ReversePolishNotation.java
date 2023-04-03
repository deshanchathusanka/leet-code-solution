package com.solution.datastructures.stack;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        final String[] operatorsArray = {"+", "-", "*", "/"};
        final List<String> operators = Arrays.asList(operatorsArray);

        Stack<String> stack = new Stack<>();

        for (String opt : tokens) {
            if (operators.contains(opt)) {
                String opd2 = stack.pop();
                String opd1 = stack.pop();
                int value = evaluate(opd1, opd2, opt);
                stack.push(Integer.toString(value));
            } else {
                stack.push(opt);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private int evaluate(String opd1, String opd2, String opt) {
        int value;
        int opd1nt = Integer.parseInt(opd1);
        int opd2Int = Integer.parseInt(opd2);
        switch (opt) {
            case "+":
                value = opd1nt + opd2Int;
                break;
            case "-":
                value = opd1nt - opd2Int;
                break;
            case "*":
                value = opd1nt * opd2Int;
                break;
            case "/":
                value = opd1nt / opd2Int;
                break;
            default:
                value = 0;
        }
        return value;
    }
}
