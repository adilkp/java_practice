public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Laptop laptop1 = Laptop.getLaptop();
        Laptop laptop2 = Laptop.getLaptop();
        System.out.println("Object 1 : "+laptop1.hashCode());
        System.out.println("Object 2 : "+laptop2.hashCode());
    }
}