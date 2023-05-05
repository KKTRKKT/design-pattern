package me.kktrkkt.designpattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderProxyTest {

    @Test
    public void sendMessage_test() {
        MessageSender sender = new MessageSenderProxy(new EmailSender());
        sender.sendMessage("Hello");
    }
}