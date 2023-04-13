package me.kktrkkt.designpattern.mediator;

import java.time.LocalDateTime;

public class FrontDesk {

    private final CleaningService cleaningService;
    private final Gym gym;
    private final Restaurant restaurant;

    public FrontDesk(CleaningService cleaningService, Gym gym, Restaurant restaurant) {
        this.cleaningService = cleaningService;
        this.gym = gym;
        this.restaurant = restaurant;
    }

    public void getTower(int roomNumber, int numberOfTower) {
        this.cleaningService.getTower(roomNumber, numberOfTower);
    }

    public void cleanGym() {
        this.cleaningService.clean(this.gym);
    }

    public void cleanRestaurant(){
        this.cleaningService.clean(this.restaurant);
    }

    public void dinner(int roomNumber, LocalDateTime time) {
        this.restaurant.dinner(roomNumber, time);
    }

    public int getRoomNumber(){
        return 1111;
    }
}
