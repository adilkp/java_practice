package FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {

        // Android a = new Android();
        // a.spec();

        // IOS ios = new IOS();
        // ios.spec();
        OS obj = new Android();
        obj.spec();

        FactoryClass f = new FactoryClass();
        OS o = f.getInstance("closed");
        o.spec();
        
    }
}
