package me.kktrkkt.designpattern.flyweight;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void car_test(){
        List<Car> cars = List.of(
                new Car("Tesla", "Model S", "white"),
                new Car("Tesla", "Model S", "white"),
                new Car("Tesla", "Model 3", "red"),
                new Car("Tesla", "Model 3", "red"),
                new Car("Tesla", "Model S", "white")
        );

        assertEquals(cars.get(0).hashCode(), cars.get(1).hashCode());
        assertEquals(cars.get(1).hashCode(), cars.get(4).hashCode());
        assertEquals(cars.get(2).hashCode(), cars.get(3).hashCode());
    }

}