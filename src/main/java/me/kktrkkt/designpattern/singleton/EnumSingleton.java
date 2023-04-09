package me.kktrkkt.designpattern.singleton;

// 완전무결한 형태의 싱글톤
// 멀티스레딩에 안전하며, 리플렉션을 이용한 객체 생성에 안전한 방법
public enum EnumSingleton {
    INSTANCE;
}
