package me.kktrkkt.designpattern.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurant {

    public void dinner(int roomNumber, LocalDateTime time) {
        System.out.println("dinner " + roomNumber + " at " + time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
    }
}
