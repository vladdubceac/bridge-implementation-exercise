package learning.vladdubceac.bridge.abstraction;

import learning.vladdubceac.bridge.implementer.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, int borderSize){
        this(color);
        this.borderSize = borderSize;
    }

    @Override
   public void drawShape() {
        System.out.print("\tThis Rectangle colored with: ");
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
        return this.borderSize;
    }
}
