package designpatterns.Creational.AbstractFactory;

public class GeometryBox extends StationaryItem {
    private int length, width;

    public GeometryBox(int id, String name, int price, int length, int width) {
        super(id, name, price);
        this.length = length;
        this.width = width;
    }
}
