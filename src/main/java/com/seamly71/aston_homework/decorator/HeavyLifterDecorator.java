package com.seamly71.aston_homework.decorator;

import java.util.ArrayList;
import java.util.List;

public class HeavyLifterDecorator extends Sportsman{
    private Sportsman inner;

    public HeavyLifterDecorator(Sportsman inner){
        this.inner = inner;
    }

    @Override
    public List<String> inventory() {
        List<String> skierInventory = new ArrayList<>(List.of("Штанга", "Гири"));
        skierInventory.addAll(inner.inventory());
        return skierInventory;
    }

    @Override
    public List<String> tricks() {
        List<String> skierTricks = new ArrayList<>(List.of(
                "Я умею жонглировать гирями.",
                "Я могу запустить ядро в стратосферу."
        ));
        skierTricks.addAll(inner.tricks());
        return skierTricks;
    }
}
