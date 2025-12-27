package com.seamly71.aston_homework.adapter;

public class GamepadToKeyboardAdapter implements Keyboard {

    Gamepad gamepad;

    public GamepadToKeyboardAdapter(Gamepad gamepad) {
        this.gamepad = gamepad;
    }

    @Override
    public void moveUp() {
        gamepad.moveStick(0, 1);
    }

    @Override
    public void moveDown() {
        gamepad.moveStick(0, -1);
    }

    @Override
    public void moveRight() {
        gamepad.moveStick(1, 0);
    }

    @Override
    public void moveLeft() {
        gamepad.moveStick(-1, 0);
    }
}
