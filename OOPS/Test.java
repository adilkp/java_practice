
package OOPS;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        
        Student s2 = new Student();
        int t = s1.age;
        s1.age = s2.age;
        s2.age = t;
        
        s2.display();
    }
}