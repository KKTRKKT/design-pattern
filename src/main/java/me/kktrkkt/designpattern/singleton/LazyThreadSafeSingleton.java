package me.kktrkkt.designpattern.singleton;

public class LazyThreadSafeSingleton {
    private static volatile LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {}

    public static LazyThreadSafeSingleton getInstance() {
        if(instance == null) {
            synchronized (LazyThreadSafeSingleton.class) {
                instance = new LazyThreadSafeSingleton();
            }
        }

        return instance;
    }
}
