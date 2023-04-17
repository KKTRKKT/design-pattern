package me.kktrkkt.designpattern.observer.property_change;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ChatServer {

    private final PropertyChangeSupport pcs;

    public ChatServer() {
        this.pcs = new PropertyChangeSupport(this);
    }

    public void register(String subject, PropertyChangeListener subscriber) {
        this.pcs.addPropertyChangeListener(subject, subscriber);
    }

    public void unRegister(String subject, PropertyChangeListener subscriber) {
        this.pcs.removePropertyChangeListener(subject, subscriber);
    }

    public void sendMessage(String name, String subject, String message){
        this.pcs.firePropertyChange(subject, null, "[" + subject + "] " + name + " : " + message);
    }
}