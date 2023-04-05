package me.kktrkkt.designpattern.proxy;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message sent: " + message);
    }
}