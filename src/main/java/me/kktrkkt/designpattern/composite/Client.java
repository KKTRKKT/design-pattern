package me.kktrkkt.designpattern.composite;

public class Client {

    public int getDoranBladeAndHealPotionPrice(){
        Item doranBlade = new DoranBlade();
        Item healPotion = new HealPotion();

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        return bag.getPrice();
    }

    public int getBloodBladeAndHealPotionPrice(){
        Item bloodBlade = new BloodBlade();
        Item healPotion = new HealPotion();

        Bag bag = new Bag();
        bag.add(bloodBlade);
        bag.add(healPotion);

        return bag.getPrice();
    }
}
