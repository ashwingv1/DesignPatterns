package designpatterns.Creational.FactoryMethod;

public class Pen extends StationaryItem{
    String color;

    public Pen(int id, String name, int price, String color) {
        super(id, name, price);
        this.color = color;
    }
}
