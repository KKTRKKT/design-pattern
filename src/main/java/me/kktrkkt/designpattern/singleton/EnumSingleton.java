package me.kktrkkt.designpattern.singleton;

// 완전무결한 형태의 싱글톤
// 멀티스레딩에 안전하며, 리플렉션이나 바이트코드 조작에서도 안전하다.
public enum EnumSingleton {
    INSTANCE;
}
