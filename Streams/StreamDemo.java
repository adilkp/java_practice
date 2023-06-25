package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,1,4,5));
        List<Integer> list = List.of(3,2,1,4,5);
//        List<Integer> sortedList = list.stream().sorted((n1,n2)->n2-n1).toList();
//        System.out.println(sortedList);
        System.out.println(list.stream().sorted((n1, n2) -> n2 - n1).toList().get(1));

        System.out.println(list.stream().map(e -> e * e).collect(Collectors.toList()));


    }
}
