package learning.vladdubceac.bridge.abstraction;

import learning.vladdubceac.bridge.implementer.Color;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    public Triangle(Color color, int borderSize) {
        super(color, borderSize);
    }

    @Override
   public void drawShape() {
        System.out.print("\tThis Triangle colored with: ");
        color.fillWithColor(borderSize);
    }

    @Override
    public void modifyBorder(int newBorder) {
        float times = (float) newBorder/borderSize;
        borderSize = newBorder;
        System.out.println("Now we are changing the border length "+times+" times");
        drawShape();
    }

    public int getBorderSize(){
        return borderSize;
    }
}
