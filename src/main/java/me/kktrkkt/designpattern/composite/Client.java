package me.kktrkkt.designpattern.composite;

import java.util.stream.Collectors;

public class Client {

    public int getDoranBladeAndHealPotionPrice(){
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        return bag.getPrice();
    }

    public int getBloodBladeAndHealPotionPrice(){
        Item bloodBlade = new Item("흡혈검", 350);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(bloodBlade);
        bag.add(healPotion);

        return bag.getPrice();
    }
}
