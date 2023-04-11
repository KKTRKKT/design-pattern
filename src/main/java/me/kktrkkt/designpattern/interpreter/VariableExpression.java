package me.kktrkkt.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

public class VariableExpression implements PostFixExpression {

    private final char character;

    public VariableExpression(char character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(character);
    }
}
