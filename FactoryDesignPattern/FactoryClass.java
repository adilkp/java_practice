package FactoryDesignPattern;

public class FactoryClass {

    public OS getInstance(String str) {
        if(str.equals("open")) return new Android();
        else return new IOS();
    }    
}
