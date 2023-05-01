package me.kktrkkt.designpattern.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    public void getDoranBladeAndHealPotionPriceTest() {
        Bag bag = new Bag();
        bag.add(new DoranBlade());
        bag.add(new HealPotion());
        bag.add(new HealPotion());

        int price = bag.getPrice();
        System.out.println(bag.getName());
        assertEquals(price, 550);
    }

    @Test
    public void getBloodBladeAndHealPotionPrice() {
        Bag bag = new Bag();
        bag.add(new BloodBlade());
        bag.add(new HealPotion());

        int price = bag.getPrice();
        System.out.println(bag.getName());
        assertEquals(price, 400);
    }
}