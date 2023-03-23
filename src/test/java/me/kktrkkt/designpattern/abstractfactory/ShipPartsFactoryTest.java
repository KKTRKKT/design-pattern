package me.kktrkkt.designpattern.abstractfactory;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ShipPartsFactoryTest {

    @ParameterizedTest
    @MethodSource("provideShipPartsFactory")
    public void ship_parts_factory_test(ShipPartsFactory shipPartsFactory) {
        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(shipPartsFactory);
        Ship ship = whiteShipFactory.createShip();

        if (shipPartsFactory instanceof WhiteShipPartsFactory) {
            assertAll(
                    () -> assertEquals(WhiteWheel.class, ship.getWheel().getClass()),
                    () -> assertEquals(WhiteAnchor.class, ship.getAnchor().getClass())
            );
        } else if (shipPartsFactory instanceof BlackShipPartsFactory) {
            assertAll(
                    () -> assertEquals(BlackWheel.class, ship.getWheel().getClass()),
                    () -> assertEquals(BlackAnchor.class, ship.getAnchor().getClass())
            );
        } else {
            throw new IllegalStateException("Unexpected value: " + shipPartsFactory.getClass().getName());
        }

    }

    static Stream<Arguments> provideShipPartsFactory(){
        return Stream.of(
                Arguments.of(new WhiteShipPartsFactory()),
                Arguments.of(new BlackShipPartsFactory()),
                Arguments.of(new BlackShipPartsFactory()),
                Arguments.of(new BlackShipPartsFactory()),
                Arguments.of(new WhiteShipPartsFactory())
        );
    }
}