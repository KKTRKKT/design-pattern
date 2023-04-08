package me.kktrkkt.designpattern.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixNotationTest {

    @Test
    public void calculate_test() {
        PostfixNotation postfixNotation = new PostfixNotation();
        Integer result = postfixNotation.calculate("123+-");

        assertEquals(-4, result);
    }
}