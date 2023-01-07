package designpatterns.Creational.AbstractFactory;

public class StationaryItem implements Item{
    private int id;
    private String name;
    private int price;

    public StationaryItem(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
