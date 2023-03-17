package me.kktrkkt.designpattern.singleton;

public class StaticInnerThreadSafeSingleton {
    private StaticInnerThreadSafeSingleton() {}

    private static class Holder {
        static final StaticInnerThreadSafeSingleton INSTANCE = new StaticInnerThreadSafeSingleton();
    }

    public static StaticInnerThreadSafeSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
