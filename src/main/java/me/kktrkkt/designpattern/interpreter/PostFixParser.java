package me.kktrkkt.designpattern.interpreter;

import java.util.Stack;

public class PostFixParser {

    public static PostFixExpression parse(String text) {
        Stack<PostFixExpression> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            switch (c) {
                case '+':
                    stack.push(new PlusExpression(stack.pop(), stack.pop()));
                    break;
                case '-':
                    PostFixExpression right = stack.pop();
                    PostFixExpression left = stack.pop();
                    stack.push(new MinusExpression(left, right));
                    break;
                default:
                    stack.push(new VariableExpression(c));
            }
        }

        return stack.pop();
    }
}
