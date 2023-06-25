package Sets;

import java.util.HashSet;
import java.util.Set;

public class HashDemo {

    public static void main(String[] args) {
        Book b1 = new Book(1, "abc", "hij");
        Book b2 = new Book(1, "abc", "hij");
        Book b3 = new Book(2, "abw", "hig");
    
        Set<Book> set = new HashSet<Book>();
        
        set.add(b1);
        set.add(b2);
        set.add(b3);
        // set.forEach(e->System.out.println(e.hashCode()));

        Set<String> s = new HashSet<>();

        String s1 = new String("adil");
        String s2 = new String("adil");
        String s3 = new String("sana");

        s.add(s1);
        s.add(s2);
        s.add(s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // System.out.println(s.size());

        // s.forEach(e->System.out.println(e.hashCode()));

    }    
}
