package me.kktrkkt.designpattern.interpreter;

import java.util.Stack;

public class PostfixNotation {

    public PostfixNotation() {}

    public Integer calculate(String expression) {
        Stack<Integer> numbers = new Stack<>();

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        return numbers.pop();
    }
}
