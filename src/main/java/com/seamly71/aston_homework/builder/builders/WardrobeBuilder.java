package com.seamly71.aston_homework.builder.builders;

import com.seamly71.aston_homework.builder.Wardrobe;
import lombok.Getter;

@Getter
public abstract class WardrobeBuilder {
    protected Wardrobe wardrobe;

    public void initializeWardrobe() {
        wardrobe = new Wardrobe();
    }

    public abstract void setModel();

    public abstract void setDimensions();

    public abstract void setColor();

    public abstract void setDoorMechanism();

    public abstract void setHasMirror();

}
