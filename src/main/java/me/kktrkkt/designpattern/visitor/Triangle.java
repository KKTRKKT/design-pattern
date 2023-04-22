package me.kktrkkt.designpattern.visitor;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.printTo(this);
    }

}
