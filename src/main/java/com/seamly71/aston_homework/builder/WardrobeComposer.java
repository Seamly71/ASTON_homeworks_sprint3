package com.seamly71.aston_homework.builder;

import com.seamly71.aston_homework.builder.builders.WardrobeBuilder;

public class WardrobeComposer {

    public Wardrobe buildWardrobe(WardrobeBuilder builder){
        builder.initializeWardrobe();
        builder.setModel();
        builder.setDimensions();
        builder.setColor();
        builder.setDoorMechanism();
        builder.setHasMirror();
        return builder.getWardrobe();
    }
}
