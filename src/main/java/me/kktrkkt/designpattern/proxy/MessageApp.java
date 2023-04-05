package me.kktrkkt.designpattern.proxy;

public class MessageApp {
    public static void main(String[] args) {
        MessageSender sender = new MessageSenderProxy(new EmailSender());
        sender.sendMessage("Hello");
    }
}