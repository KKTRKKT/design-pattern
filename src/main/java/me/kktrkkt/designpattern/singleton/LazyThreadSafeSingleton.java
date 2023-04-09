package me.kktrkkt.designpattern.singleton;

// 멀티스레딩에 안전하며,Lazy Loading을 구현하는 싱글톤 패턴
public class LazyThreadSafeSingleton {
    // volatile은 메모리에 직접 읽고 쓰는 방식으로, 중간에 다른 연산이 실행되지 않는다(원자성)
    private static volatile LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {}

    public static LazyThreadSafeSingleton getInstance() {
        if(instance == null) {
            // synchronized 블록을 이용해 객체 생성 부분을 제어한다.
            synchronized (LazyThreadSafeSingleton.class) {
                instance = new LazyThreadSafeSingleton();
            }
        }

        return instance;
    }
}
