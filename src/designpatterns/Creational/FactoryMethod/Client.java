package designpatterns.Creational.FactoryMethod;

public class Client {

    public static void main(String [] args){
        // Factory method
        StationaryItem geometry = StationaryItemsFactory.create("GeometryBox");
        StationaryItem Pen = StationaryItemsFactory.create("Pen");

        //Abstrct Factory
    }
}
