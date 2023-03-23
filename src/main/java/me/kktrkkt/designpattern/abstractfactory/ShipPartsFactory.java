package me.kktrkkt.designpattern.abstractfactory;

public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}
