package me.kktrkkt.designpattern.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bag implements Item {

    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    @Override
    public String getName() {
        return items.stream()
                .map(item -> "["+item.getName()+"]")
                .collect(Collectors.joining(", "));
    }
}
