package me.kktrkkt.designpattern.visitor;

public class Pad implements Device {
    @Override
    public void printTo(Rectangle rectangle) {
        System.out.println("print Rectangle to pad");
    }

    @Override
    public void printTo(Triangle triangle) {
        System.out.println("print Triangle to pad");
    }

    @Override
    public void printTo(Circle circle) {
        System.out.println("print Circle to pad");
    }
}
