package learning.vladdubceac.bridge.abstraction;

import learning.vladdubceac.bridge.implementer.Color;

public abstract class Shape {
    protected Color color;
    protected int borderSize;

    protected Shape(Color color){
        this.color = color;
        borderSize = 1;
    }

    protected Shape(Color color, int borderSize){
        this(color);
        this.borderSize = borderSize;
    }

    public abstract void drawShape();
    public abstract void modifyBorder(int newBorder);
}
