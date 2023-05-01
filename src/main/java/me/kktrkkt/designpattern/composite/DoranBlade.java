package me.kktrkkt.designpattern.composite;

public class DoranBlade implements Item{
    @Override
    public int getPrice() {
        return 450;
    }

    @Override
    public String getName() {
        return "도란검";
    }
}
