package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipFactoryTest {

    @Test
    public void orderShipTest() {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        assertNotNull(whiteship);
        assertEquals("Whiteship", whiteship.getName());

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        assertNotNull(blackship);
        assertEquals("Blackship", blackship.getName());
    }
}