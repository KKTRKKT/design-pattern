package me.kktrkkt.designpattern.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class BlueLightRedLightTest {

    static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void beforeAll() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void speed_normal_test(){
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());

        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }

}