package me.kktrkkt.designpattern.factorymethod;

public interface ShipFactory {
    Ship orderShip(String name, String email);

    Ship createShip();

}
