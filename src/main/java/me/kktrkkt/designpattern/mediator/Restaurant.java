package me.kktrkkt.designpattern.mediator;

public class Restaurant {

    private final CleaningService cleaningService;

    public Restaurant(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
