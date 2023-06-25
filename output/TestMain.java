package output;

public class TestMain {
    public static void main(String[] args) {
        String s1 = new String("Adil");
        String s2 = new String("Adil");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
    }
    
}
