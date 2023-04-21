package me.kktrkkt.designpattern.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        assertTrue(outContent.toString().contains("무 궁 화    꽃   이"));
        blueLightRedLight.redLight();
        assertTrue(outContent.toString().contains("피 었 습 니  다."));
    }

    @Test
    public void speed_fast_test(){
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Fast());

        blueLightRedLight.blueLight();
        assertTrue(outContent.toString().contains("무궁화꽃이"));
        blueLightRedLight.redLight();
        assertTrue(outContent.toString().contains("피었습니다."));
    }

}