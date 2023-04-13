package me.kktrkkt.designpattern.mediator;

public class Guest {

    private final Restaurant restaurant;

    private final CleaningService cleaningService;


    public Guest(Restaurant restaurant, CleaningService cleaningService) {
        this.restaurant = restaurant;
        this.cleaningService = cleaningService;
    }

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }

}
