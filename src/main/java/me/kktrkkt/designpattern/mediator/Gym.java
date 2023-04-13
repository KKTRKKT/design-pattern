package me.kktrkkt.designpattern.mediator;

public class Gym {

    private final CleaningService cleaningService;

    public Gym(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
