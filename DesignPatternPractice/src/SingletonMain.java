import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Laptop laptop1 = Laptop.getLaptop();
        Laptop laptop2 = Laptop.getLaptop();
        System.out.println("Object 1 : "+laptop1.hashCode());
        System.out.println("Object 2 : "+laptop2.hashCode());

        System.out.println("Phone 1 : "+SmartPhone.getSmartPhone().hashCode());
        System.out.println("Phone 2 : "+SmartPhone.getSmartPhone().hashCode());

        //Breaking Singleton DP using Reflexion API

        Constructor<Laptop> constructor = Laptop.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Laptop laptop3 = constructor.newInstance();

        System.out.println("Object 3 : "+laptop3.hashCode());

        //Breaking Singleton DP using enum

        LaptopSingleton laptopSingleton1 = LaptopSingleton.INSTANCE;
        LaptopSingleton laptopSingleton2 = LaptopSingleton.INSTANCE;
        System.out.println(laptopSingleton1.hashCode());
        System.out.println(laptopSingleton2.hashCode());

    }
}