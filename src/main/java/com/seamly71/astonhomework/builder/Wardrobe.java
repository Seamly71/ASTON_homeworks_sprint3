package com.seamly71.astonhomework.builder;

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

    Wardrobe(
            String model,
            int[] dimensions,
            String color,
            String doorMechanism,
            boolean hasMirror
    ) {
        this.model = model;
        this.dimensions = dimensions;
        this.color = color;
        this.doorMechanism = doorMechanism;
        this.hasMirror = hasMirror;
    }

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

    public static WardrobeBuilder builder() {
        return new WardrobeBuilder();
    }

    public static class WardrobeBuilder {
        private String model;
        private int[] dimensions;
        private String color;
        private String doorMechanism;
        private boolean hasMirror;

        WardrobeBuilder() {
            hasMirror = false;
        }

        public WardrobeBuilder model(String model) {
            this.model = model;
            return this;
        }

        public WardrobeBuilder dimensions(int a, int b, int c) {
            this.dimensions = new int[]{a, b, c};
            return this;
        }

        public WardrobeBuilder color(String color) {
            this.color = color;
            return this;
        }

        public WardrobeBuilder doorMechanism(String doorMechanism) {
            this.doorMechanism = doorMechanism;
            return this;
        }

        public WardrobeBuilder hasMirror(boolean hasMirror) {
            this.hasMirror = hasMirror;
            return this;
        }

        public Wardrobe build() {
            return new Wardrobe(
                    this.model,
                    this.dimensions,
                    this.color,
                    this.doorMechanism,
                    this.hasMirror
            );
        }
    }
}
