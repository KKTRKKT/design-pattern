package me.kktrkkt.designpattern.proxy;

public class MessageSenderProxy implements MessageSender {

    private final MessageSender sender;

    public MessageSenderProxy(MessageSender sender) {
        this.sender = sender;
    }


    @Override
    public void sendMessage(String message) {
        System.out.println("AD");
        this.sender.sendMessage(message);
        System.out.println("AD");
    }
}
