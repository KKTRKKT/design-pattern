package me.kktrkkt.designpattern.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {

    @Test
    public void orderShipTest() {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "keesun@mail.com");
        assertNotNull(whiteShip);
        assertEquals("WhiteShip", whiteShip.getName());

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "keesun@mail.com");
        assertNotNull(blackShip);
        assertEquals("BlackShip", blackShip.getName());
    }
}