package me.kktrkkt.designpattern.templatemethod;

public class Plus extends FileProcessor {

    public Plus(String path) {
        super(path);
    }

    @Override
    protected int calculate(int result, int number) {
        return result += number;
    }
}
