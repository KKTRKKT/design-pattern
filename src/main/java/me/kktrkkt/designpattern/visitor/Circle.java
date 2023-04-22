package me.kktrkkt.designpattern.visitor;

public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.printTo(this);
    }
}
