package me.kktrkkt.designpattern.abstractfactory;

public class BlackShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new BlackAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new BlackWheel();
    }
}
