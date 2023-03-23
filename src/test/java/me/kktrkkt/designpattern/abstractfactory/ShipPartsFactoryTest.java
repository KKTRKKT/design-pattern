package me.kktrkkt.designpattern.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipPartsFactoryTest {

    @Test
    public void white_ship_parts_factory_test() {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        assertEquals(WhiteWheel.class, ship.getWheel().getClass());
        assertEquals(WhiteAnchor.class, ship.getAnchor().getClass());
    }

    @Test
    public void black_ship_parts_factory_test() {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new BlackShipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        assertEquals(BlackWheel.class, ship.getWheel().getClass());
        assertEquals(BlackAnchor.class, ship.getAnchor().getClass());
    }

}