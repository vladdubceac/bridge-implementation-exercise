package learning.vladdubceac.bridge.implementer;

public class RedColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with "+border+" inch border");
    }
}
