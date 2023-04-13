package me.kktrkkt.designpattern.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void guest_test() {
        Guest guest = new Guest(new Restaurant(), new CleaningService());
        guest.getTower(3);
        guest.dinner();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }

}