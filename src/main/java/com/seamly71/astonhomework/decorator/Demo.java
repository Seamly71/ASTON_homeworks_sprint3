package com.seamly71.astonhomework.decorator;

public class Demo {

    public static void main(String[] args) {
        Sportsman sportsman = new Biker();
        System.out.println(sportsman);

        sportsman = new SkierDecorator(sportsman);
        System.out.println(sportsman);

        sportsman = new HeavyLifterDecorator(sportsman);
        System.out.println(sportsman);
    }
}
