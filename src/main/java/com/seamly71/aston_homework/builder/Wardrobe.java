package com.seamly71.aston_homework.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wardrobe {
    private String model;
    private int[] dimensions;
    private String color;
    private String doorMechanism;
    private boolean hasMirror;

    public String toString() {
        return String.format(
                """
                        Модель: %s
                        Размеры: %dx%dx%d
                        Цвет: %s
                        Дверной механизм: %s
                        Наличие зеркала: %s""",
                model,
                dimensions[0], dimensions[1], dimensions[2],
                color,
                doorMechanism,
                hasMirror
        );
    }
}
