package me.kktrkkt.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements PriceComposite {

    private final List<PriceComposite> items = new ArrayList<>();

    public void add(PriceComposite item) {
        items.add(item);
    }

    public List<PriceComposite> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(PriceComposite::getPrice).sum();
    }
}
