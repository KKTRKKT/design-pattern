package me.kktrkkt.designpattern.abstractfactory;

public interface ShipFactory {
    Ship orderShip(String name, String email);

    Ship createShip();

}
