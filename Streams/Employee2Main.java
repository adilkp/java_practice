package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee2Main {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Adil","Nagpur","786786786"));
        list.add(new Employee2("Sana","Delhi","6576867467"));
        list.add(new Employee2("Adyan","Delhi","313131786"));
        list.add(new Employee2("Fuzaila","Akola","8763552645"));
        list.add(new Employee2("Tkfkht","Delhi","535465876"));

        list.stream().filter(e->e.getCity().equalsIgnoreCase("Delhi")).collect(Collectors.toList()).forEach(e-> System.out.println(e.getPhone()));




    }
}
