package me.kktrkkt.designpattern.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void getDoranBladeAndHealPotionPriceTest() {
        Client client = new Client();
        int price = client.getDoranBladeAndHealPotionPrice();
        assertEquals(price, 500);
    }

    @Test
    public void getBloodBladeAndHealPotionPrice() {
        Client client = new Client();
        int price = client.getBloodBladeAndHealPotionPrice();
        assertEquals(price, 400);
    }

}