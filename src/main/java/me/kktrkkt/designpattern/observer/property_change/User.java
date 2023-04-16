package me.kktrkkt.designpattern.observer.property_change;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class User implements PropertyChangeListener {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("(" + this.hashCode() +") " + evt.getNewValue());
    }
}
