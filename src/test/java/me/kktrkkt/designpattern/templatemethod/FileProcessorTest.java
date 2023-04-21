package me.kktrkkt.designpattern.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String PATH = "src/test/java/resources/number.txt";;

    @Test
    public void plus_test() {
        assertEquals(15, new Plus(PATH).process());
    }

    @Test
    public void multiply_test() {
        assertEquals(120, new Multiply(PATH).process());
    }

}