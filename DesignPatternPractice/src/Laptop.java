public class Laptop {
    private static Laptop laptop;

    private Laptop() {

    }
    //Lazy way of creating singleton object
    public static Laptop getLaptop() {
        synchronized(Laptop.class) {
            if (laptop == null) {
                laptop = new Laptop();
            }
        }
        return laptop;
    }
}
