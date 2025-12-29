package com.seamly71.astonhomework.decorator;

import java.util.List;

public class Biker extends Sportsman {

    @Override
    public List<String> inventory() {
        return List.of("Велосипед");
    }

    @Override
    public List<String> tricks() {
        return List.of("Я могу балансировать на заднем колесе велосипеда.");
    }

}
