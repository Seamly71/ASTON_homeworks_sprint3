package com.seamly71.aston_homework.builder.builders;

public class GrimoWardrobeBuilder extends WardrobeBuilder{
    @Override
    public void setModel() {
        wardrobe.setModel("PAX/GRIMO");
    }

    @Override
    public void setDimensions() {
        wardrobe.setDimensions(new int[]{78, 23, 79});
    }

    @Override
    public void setColor() {
        wardrobe.setColor("dark green");
    }

    @Override
    public void setDoorMechanism() {
        wardrobe.setDoorMechanism("hinge doors");
    }

    @Override
    public void setHasMirror() {
        wardrobe.setHasMirror(false);
    }
}