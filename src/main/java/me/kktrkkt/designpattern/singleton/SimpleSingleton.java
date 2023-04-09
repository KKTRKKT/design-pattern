package me.kktrkkt.designpattern.singleton;

// 가장 간단하게 구현한 싱글톤 패턴
public class SimpleSingleton {
    private static SimpleSingleton instance;

    // 생성자를 private으로 선언해 더 이상 생성하지 못하도록 막는다
    private SimpleSingleton() {}

    // 클라이언트는 getInstance를 이용해서만 인스턴스에 접근할 수 있고, 인스턴스는 없을 경우에만 생성된다
    // 단 멀티스레딩 환경에서는 같은 인스턴스를 못받을 수도 있다.
    public static SimpleSingleton getInstance() {
        if(instance == null) {
            instance = new SimpleSingleton();
        }

        return instance;
    }
}
