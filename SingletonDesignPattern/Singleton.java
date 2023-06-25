package SingletonDesignPattern;

public class Singleton {

    private static Singleton singleton;

    public String s;
    
    private Singleton() {
        s = "Hello I am string in singleton class";
    }

    public static Singleton getInstance() {
        if(singleton==null) {
            singleton = new Singleton();            
        }
        return singleton;
    }    
}
