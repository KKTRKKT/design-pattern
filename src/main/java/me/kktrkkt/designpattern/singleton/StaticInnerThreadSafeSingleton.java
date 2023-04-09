package me.kktrkkt.designpattern.singleton;

// 스레드에 안저하며, Lazy Loading을 구현하는 다른 방법
public class StaticInnerThreadSafeSingleton {
    // private을 이용해 인스턴스 생성을 막는다.
    private StaticInnerThreadSafeSingleton() {}

    // static inner 클래스를 이용해, Holder 클래스가 사용되는 경우에만 오직 하나의 인스턴스를 생성한다.
    // 멀티스레딩에 안전하며, Lazy Loading을 구현했다(인스턴스를 사용하는 경우에만 메모리 적재)
    private static class Holder {
        static final StaticInnerThreadSafeSingleton INSTANCE = new StaticInnerThreadSafeSingleton();
    }

    // getInstance 호출이 없으면 Holder의 INSTANCE는 생성되지 않는다.
    public static StaticInnerThreadSafeSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
