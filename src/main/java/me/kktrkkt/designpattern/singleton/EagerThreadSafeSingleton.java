package me.kktrkkt.designpattern.singleton;

// 스레드에 안전하고, Eager Loading을 구현한 싱글톤
public class EagerThreadSafeSingleton {
    // static으로 메모리상에 하나의 인스턴스만 존재한다.
    // 단, 인스턴스 호출 여부에 상관없이 인스턴스가 메모리에 적재된다.
    private static final EagerThreadSafeSingleton INSTANCE = new EagerThreadSafeSingleton();

    private EagerThreadSafeSingleton() {}

    public static EagerThreadSafeSingleton getInstance() {
        return INSTANCE;
    }
}
