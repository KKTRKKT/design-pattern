package me.kktrkkt.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private final Map<String, Car> carMap;

    public CarFactory() {
        this.carMap = new HashMap<>();
    }

    public Car createCar(String make, String name, String color){
        String key = make+":"+name+":"+color;
        Car car = carMap.get(key);

        if(car == null){
            car = new Car(make, name, color);
            carMap.put(key, car);
        }

        return car;
    }

}
