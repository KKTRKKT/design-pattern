package me.kktrkkt.designpattern.observer;

import java.util.*;

public class ChatServer {

    private final Map<String, List<ChatServerSubscriber>> subscribers;

    public ChatServer() {
        this.subscribers = new HashMap<>();
    }

    public void register(String subject, ChatServerSubscriber...subscriber) {
        List<ChatServerSubscriber> asList = Arrays.asList(subscriber);
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).addAll(asList);
        } else {
            ArrayList<ChatServerSubscriber> newList = new ArrayList<>(asList);
            this.subscribers.put(subject, newList);
        }

        Arrays.stream(subscriber).forEach(s->s.handleMessage(subject + " " + "registered"));
    }

    public void unRegister(String subject, ChatServerSubscriber...subscriber) {
        this.subscribers.get(subject).removeAll(Arrays.asList(subscriber));
        Arrays.stream(subscriber).forEach(s->s.handleMessage(subject + " " + "unregistered"));
    }

    public void sendMessage(String name, String subject, String message){
        this.subscribers.get(subject).forEach(s->s.handleMessage("[" + subject + "] " + name + " : " + message));
    }
}
