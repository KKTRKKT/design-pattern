package me.kktrkkt.designpattern.strategy;

public class BlueLightRedLight {

    private Speed strategy;

    public BlueLightRedLight(Speed strategy) {
        this.strategy = strategy;
    }

    public void blueLight() {
        this.strategy.blueLight();
    }

    public void redLight() {
        this.strategy.redLight();
    }

    public Speed getStrategy() {
        return strategy;
    }

    public void setStrategy(Speed strategy) {
        this.strategy = strategy;
    }
}
