public class Laptop {
    private static Laptop laptop;

    private Laptop() {

    }
    //Lazy way of creating singleton object
    public static Laptop getLaptop() {
        if(laptop==null) {
            laptop = new Laptop();
        }
        return laptop;
    }
}
