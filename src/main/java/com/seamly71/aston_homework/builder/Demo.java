package com.seamly71.aston_homework.builder;

import com.seamly71.aston_homework.builder.builders.AuliWardrobeBuilder;
import com.seamly71.aston_homework.builder.builders.GrimoWardrobeBuilder;

public class Demo {

    public static void main(String[] args) {
        WardrobeComposer composer = new WardrobeComposer();

        Wardrobe auli = composer.buildWardrobe(new AuliWardrobeBuilder());
        System.out.println(auli);

        System.out.println();
        Wardrobe grimo = composer.buildWardrobe(new GrimoWardrobeBuilder());
        System.out.println(grimo);
    }
}
