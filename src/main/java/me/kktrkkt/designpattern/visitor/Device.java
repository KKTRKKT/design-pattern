package me.kktrkkt.designpattern.visitor;

public interface Device {
    void printTo(Rectangle rectangle);

    void printTo(Triangle triangle);

    void printTo(Circle circle);
}
