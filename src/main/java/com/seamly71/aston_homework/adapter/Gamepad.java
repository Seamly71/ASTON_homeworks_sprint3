package com.seamly71.aston_homework.adapter;

public class Gamepad {

    public void moveStick(double x, double y) {
        System.out.println(String.format(
                "Двигаюсь на %f вверх, на %f вправо", y, x
        ));
    }
}
