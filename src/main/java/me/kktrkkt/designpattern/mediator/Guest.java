package me.kktrkkt.designpattern.mediator;

import java.time.LocalDateTime;

public class Guest {

    private int roomNumber;

    private final FrontDesk frontDesk;

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void dinner(LocalDateTime time) {
        frontDesk.dinner(this.roomNumber, time);
    }

    public void getTower(int numberOfTower) {
        frontDesk.getTower(this.roomNumber, numberOfTower);
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
