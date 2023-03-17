package me.kktrkkt.designpattern.singleton;

public class EagerThreadSafeSingleton {
    private static final EagerThreadSafeSingleton INSTANCE = new EagerThreadSafeSingleton();

    private EagerThreadSafeSingleton() {}

    public static EagerThreadSafeSingleton getInstance() {
        return INSTANCE;
    }
}
