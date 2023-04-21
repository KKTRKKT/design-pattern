package me.kktrkkt.designpattern.templatemethodcallback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileProcessorTest {

    private static final String PATH = "src/test/java/resources/number.txt";;

    @Test
    public void plus_test() {
        assertEquals(15, new FileProcessor(PATH).process(FileProcessor.Operator::plus));
    }

    @Test
    public void multiply_test() {
        assertEquals(120, new FileProcessor(PATH).process(FileProcessor.Operator::multiply));
    }

}