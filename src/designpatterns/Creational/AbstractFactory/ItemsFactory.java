package designpatterns.Creational.AbstractFactory;

public interface ItemsFactory<T> {

    T create(String type);
}
