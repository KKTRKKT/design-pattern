package me.kktrkkt.designpattern.visitor;

public class Watch implements Device{
    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("print Rectangle to watch");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("print Triangle to watch");
    }

    @Override
    public void printTo(Circle circle) {
        System.out.println("print Circle to watch");
    }
}
