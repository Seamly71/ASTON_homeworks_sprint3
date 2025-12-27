package com.seamly71.aston_homework.builder.builders;

public class AuliWardrobeBuilder extends WardrobeBuilder{
    @Override
    public void setModel() {
        wardrobe.setModel("PAX/AULI");
    }

    @Override
    public void setDimensions() {
        wardrobe.setDimensions(new int[]{59, 26, 93});
    }

    @Override
    public void setColor() {
        wardrobe.setColor("white");
    }

    @Override
    public void setDoorMechanism() {
        wardrobe.setDoorMechanism("sliding door");
    }

    @Override
    public void setHasMirror() {
        wardrobe.setHasMirror(true);
    }
}
