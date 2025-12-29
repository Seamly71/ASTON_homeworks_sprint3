package com.seamly71.astonhomework.decorator;

import java.util.ArrayList;
import java.util.List;

public class SkierDecorator extends Sportsman {
    private Sportsman inner;

    public SkierDecorator(Sportsman inner) {
        this.inner = inner;
    }

    @Override
    public List<String> inventory() {
        List<String> skierInventory = new ArrayList<>(List.of("Лыжи", "Палки"));
        skierInventory.addAll(inner.inventory());
        return skierInventory;
    }

    @Override
    public List<String> tricks() {
        List<String> skierTricks = new ArrayList<>(List.of(
                "Я могу делать бэкфлипы на трамплинах."
        ));
        skierTricks.addAll(inner.tricks());
        return skierTricks;
    }
}
