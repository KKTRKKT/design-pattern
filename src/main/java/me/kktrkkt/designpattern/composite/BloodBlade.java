package me.kktrkkt.designpattern.composite;

public class BloodBlade implements Item{
    @Override
    public int getPrice() {
        return 350;
    }

    @Override
    public String getName() {
        return "흡혈검";
    }
}
