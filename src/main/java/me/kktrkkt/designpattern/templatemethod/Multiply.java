package me.kktrkkt.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multiply extends FileProcessor {

    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int calculate(int result, int number) {
        return result *= number;
    }
}
