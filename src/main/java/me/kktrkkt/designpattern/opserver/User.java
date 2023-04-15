package me.kktrkkt.designpattern.opserver;

public class User implements ChatServerSubscriber{

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println("(" + this.hashCode() +") " + message);
    }
}
