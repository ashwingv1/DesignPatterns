package designpatterns.Creational.Singleton;

public final class Logger {
    private static Logger logger=null;
    private static int lineNo=1;

    private static Object lock = new Object();
    private Logger(){

    }

    public void log(String msg){
        System.out.println("line: "+ lineNo++ +", message: "+msg);
    }

    public static Logger getLogger(){
        if(logger==null) {
            synchronized (lock) {
                if(logger==null) logger = new Logger();
            }
        }

        return logger;
    }

}
