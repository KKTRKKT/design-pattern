package me.kktrkkt.designpattern.bridge;

public class DefaultChampion implements Champion {

    private final String name;
    private Skin skin;

    public DefaultChampion(String name, Skin skin) {
        this.name = name;
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", this.name, this.skin.getName());
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\n", this.name, this.skin.getName());
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\n", this.name, this.skin.getName());
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\n", this.name, this.skin.getName());
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\n", this.name, this.skin.getName());
    }

    @Override
    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}