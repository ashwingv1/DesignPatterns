package designpatterns.Creational.AbstractFactory;

public class Client {

    public static void main(String [] args){
        ItemsFactory<StationaryItem> stationaryItemsFactory = new StationaryItemsFactory();
        Item item1 = stationaryItemsFactory.create("Pen");
        Item item2 = stationaryItemsFactory.create("Notebook");

        ItemsFactory<HardwareItem> hardwareItemItemsFactory = new HardwareItemFactory();
        Item item3= hardwareItemItemsFactory.create("Paint");
    }
}
