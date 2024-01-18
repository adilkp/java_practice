public class Laptop {
    private static Laptop laptop;

    private Laptop() {
        //Solution to prevent breaking Singleton DP due to Reflexion API

        if(laptop!=null) {
            throw new RuntimeException("Caution..trying to break singleton DP");
        }
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
