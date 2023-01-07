package designpatterns.Creational.FactoryMethod;

public class NoteBook extends StationaryItem {
    int pageCount;

    public NoteBook(int id, String name, int price, int pageCount) {
        super(id, name, price);
        this.pageCount = pageCount;
    }
}
