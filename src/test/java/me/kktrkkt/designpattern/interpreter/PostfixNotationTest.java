package me.kktrkkt.designpattern.interpreter;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PostfixNotationTest {

    @Test
    public void calculate_test() {
        PostFixExpression expression = PostFixParser.parse("xyz+-");
        int result = expression.interpret(Map.of(
                'x', 1,
                'y', 2,
                'z', 3
        ));

        assertEquals(-4, result);
    }
}