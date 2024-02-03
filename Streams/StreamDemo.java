package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,1,4,5));
        List<Integer> list = List.of(3,2,1,4,5);
//        List<Integer> sortedList = list.stream().sorted((n1,n2)->n2-n1).toList();
//        System.out.println(sortedList);
        System.out.println(list.stream().sorted((n1, n2) -> n2 - n1).toList().get(1));


        //sorting a hashmap

        Map<String, Integer> map = new HashMap<>();
        map.put("A",4);
        map.put("B",2);
        map.put("C",1);
        map.put("D",3);

        Map<String, Integer> ans = map.entrySet()
                .stream()
                .sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
        System.out.println(ans);



    }
}
