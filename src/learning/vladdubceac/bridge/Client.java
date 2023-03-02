package learning.vladdubceac.bridge;

import learning.vladdubceac.bridge.abstraction.Rectangle;
import learning.vladdubceac.bridge.abstraction.Shape;
import learning.vladdubceac.bridge.abstraction.Triangle;
import learning.vladdubceac.bridge.implementer.GreenColor;
import learning.vladdubceac.bridge.implementer.RedColor;

public class Client {

    public static void main(String[] args) {
	// write your code here
        System.out.println("***** BRIDGE PATTERN *****");

        Shape shape1 = new Triangle(new GreenColor(),20);
        System.out.println("\nColoring Triangle ...");
        shape1.drawShape();
        shape1.modifyBorder(60);

        Shape shape2 = new Rectangle(new RedColor(), 50);
        System.out.println("\nColoring Rectangle ...");
        shape2.drawShape();
        shape2.modifyBorder(100);
    }
}
