package me.kktrkkt.designpattern.interpreter;

import java.util.Stack;

public class PostFixParser {

    public static PostFixExpression parse(String s) {
        Stack<PostFixExpression> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            new 
        }

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

        return ;
    }
}
