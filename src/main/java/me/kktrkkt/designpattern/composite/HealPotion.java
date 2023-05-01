package me.kktrkkt.designpattern.composite;

public class HealPotion implements Item{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getName() {
        return "체력 물약";
    }
}
