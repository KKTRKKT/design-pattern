package me.kktrkkt.designpattern.observer;

import org.junit.jupiter.api.Test;

class ChatServerTest {

    @Test
    public void chatServer_test() {
        ChatServer chatServer = new ChatServer();
        User kktrkkt = new User("kktrkkt");
        User shlee = new User("shlee");

        chatServer.register("디자인패턴", kktrkkt);
        chatServer.register("롤드컵2021", kktrkkt);
        chatServer.register("디자인패턴", shlee);

        chatServer.sendMessage(kktrkkt.getName(), "디자인패턴", "이번엔 옵저버 패턴입니다.");
        chatServer.sendMessage(kktrkkt.getName(), "롤드컵2021", "LCK 화이팅!");

        chatServer.unRegister("디자인패턴", kktrkkt);

        chatServer.sendMessage(shlee.getName(), "디자인패턴", "예제 코드 보는 중..");
    }

}