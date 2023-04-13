package me.kktrkkt.designpattern.mediator;

public class Hotel {

    public static void main(String[] args) {
        CleaningService cleaningService = new CleaningService();
        Restaurant restaurant = new Restaurant(cleaningService);

        Guest guest = new Guest(restaurant, new CleaningService());
        guest.getTower(3);
        guest.dinner();

        Gym gym = new Gym(cleaningService);
        gym.clean();
        restaurant.clean();

    }
}
