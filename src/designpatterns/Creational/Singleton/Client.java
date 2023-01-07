package designpatterns.Creational.Singleton;

public class Client {

    public static void main (String [] args){
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        logger1.log("Start of testing");
        logger2.log("End of testing");
    }
}
