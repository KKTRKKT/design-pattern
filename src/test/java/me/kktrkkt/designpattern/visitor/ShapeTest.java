package me.kktrkkt.designpattern.visitor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void beforeAll() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void circle_test() {
        Shape circle = new Circle();
        circle.accept(new Phone());
        circle.accept(new Watch());
        circle.accept(new Pad());
        assertEquals("print Circle to phone\nprint Circle to watch\nprint Circle to pad\n", outContent.toString());
    }

    @Test
    public void triangle_test() {
        Shape triangle = new Triangle();
        triangle.accept(new Phone());
        triangle.accept(new Watch());
        triangle.accept(new Pad());
        assertEquals("print Triangle to phone\nprint Triangle to watch\nprint Triangle to pad\n", outContent.toString());
    }

    @Test
    public void rectangle_test() {
        Shape rectangle = new Rectangle();
        rectangle.accept(new Phone());
        rectangle.accept(new Watch());
        rectangle.accept(new Pad());
        assertEquals("print Rectangle to phone\nprint Rectangle to watch\nprint Rectangle to pad\n", outContent.toString());
    }

}