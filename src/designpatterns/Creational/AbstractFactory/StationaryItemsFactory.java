package designpatterns.Creational.AbstractFactory;

public class StationaryItemsFactory implements ItemsFactory<StationaryItem> {
    public StationaryItemsFactory(){

    }
    public StationaryItem create(String type){
        StationaryItem item;
        switch (type){
            case "NoteBook" : item = new NoteBook(1,"NoteBok",30,100);
            case "Pen" : new Pen(2,"pen",10,"red");
            case "GeometryBox" : new GeometryBox(1,"GeometryBox",50,30,12);
            default:item=null;
        }
        return item;
    }
}
