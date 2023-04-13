package me.kktrkkt.designpattern.mediator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class HotelTest {

    @Test
    public void guest_test() {
        FrontDesk frontDesk = new FrontDesk(new CleaningService(), new Gym(), new Restaurant());

        Guest guest = new Guest(frontDesk);
        guest.setRoomNumber(frontDesk.getRoomNumber());
        guest.getTower(3);
        guest.dinner(LocalDateTime.now());

        frontDesk.cleanGym();
        frontDesk.cleanRestaurant();
    }

}