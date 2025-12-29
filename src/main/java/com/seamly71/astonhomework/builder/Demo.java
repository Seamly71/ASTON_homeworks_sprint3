package com.seamly71.astonhomework.builder;

public class Demo {

    public static void main(String[] args) {
        Wardrobe auli = Wardrobe.builder().model(
                "PAX/AULI"
        ).dimensions(
                59, 26, 93
        ).color(
                "white"
        ).doorMechanism(
                "sliding door"
        ).hasMirror(
                true
        ).build();
        System.out.println(auli);

        System.out.println();
        Wardrobe grimo = Wardrobe.builder().model(
                "PAX/GRIMO"
        ).dimensions(
                78, 23, 79
        ).color(
                "white"
        ).doorMechanism(
                "hinge doors"
        ).build();
        System.out.println(grimo);
    }
}
