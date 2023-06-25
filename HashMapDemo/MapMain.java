package HashMapDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMain {
    public static void main(String[] args) {
        //        System.out.println("Hello world!");
//
//        String input = "This is a sample test sample";
//        List<String> list = Arrays.stream(input.split(" ")).toList();
//
//        System.out.println(list);
//
//        Map<String, Integer> mp = new HashMap<>();
//
//        for(int i=0;i<list.size();i++) {
//            if(mp.containsKey(list.get(i))) {
//                mp.put(list.get(i),mp.get(list.get(i))+1);
//            }
//            else {
//                mp.put(list.get(i),1);
//            }
//        }
//        System.out.println(mp);

        //Remove duplicates:

////        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 5, 6);
//        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 3, 4, 5, 6).collect(Collectors.toList());

//        list.stream().collect(Collectors.toSet()).forEach(System.out::println);

//        Set<Integer> s = new HashSet<>(list);
//        list.clear();
//        list.addAll(s);
//        System.out.println(list);
//
//        StringBuilder str = new StringBuilder("SimplSilDeaGrnD");
//        Map<Character, Integer> mp = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (mp.containsKey(str.charAt(i)))
//                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
//            else {
//                mp.put(str.charAt(i), 1);
//            }
//
//        }
//        System.out.println(mp);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        System.out.println(list);

//        Map<Integer,Integer> mp = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            if(mp.containsKey(list.get(i))) {
//                mp.put(list.get(i), mp.get(list.get(i)) + 1);
//            }
//            else {
//                mp.put(list.get(i), 1);
//            }
//        }
//        System.out.println(mp);

        Map<Integer, Integer> mp = new TreeMap<>();
        for(int i=0;i<arr.length;i++) {
            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i], 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer i:mp.keySet()) {
            if(mp.get(i) > 1) ans.add(i);
        }
        if(mp.size() == arr.length) {
            ans.add(-1);
        }

//        Set<Integer> s = new HashSet<>();
//        s.addAll(list);
//        System.out.println(s);
//        list.clear();
//        list.addAll(s);
//        System.out.println(list);
//        Map<Integer, Integer> mp = new HashMap<>();
//        for(int i=0;i<list.size();i++) {
//            if(mp.containsKey(list.get(i))) {
//                mp.put(list.get(i), mp.get(list.get(i))+1);
//            }
//            else {
//                mp.put(list.get(i),1);
//            }
//        }
//        System.out.println(mp);

    }
}