package me.kktrkkt.designpattern.opserver;

public interface ChatServerSubscriber {
    void handleMessage(String message);
}
