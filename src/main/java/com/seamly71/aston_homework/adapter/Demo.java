package com.seamly71.aston_homework.adapter;

public class Demo {

    public static void main(String[] args) {
        Gamepad gamepad = new Gamepad();
        Keyboard virtualKeyboard = new GamepadToKeyboardAdapter(gamepad);

        virtualKeyboard.moveUp();
        virtualKeyboard.moveDown();
        virtualKeyboard.moveLeft();
        virtualKeyboard.moveRight();
    }
}
