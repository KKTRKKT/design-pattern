package me.kktrkkt.designpattern.mediator;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void getTower(int roomNumber, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + roomNumber);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean " + restaurant);
    }
}
