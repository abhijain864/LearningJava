import Entity.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> l = new ArrayList<>();
//        l.add(7);l.add(4);l.add(13);l.add(10);l.add(17);l.add(20);
////        Collections.sort(l);
//        System.out.println(l.stream().sorted().collect(Collectors.toList()));
//        System.out.println(l);
//        System.out.println(-((Arrays.binarySearch(l.toArray(), 8))+1));

//        School school = new School();
//        List<Integer> l = new ArrayList<>(Arrays.asList(5,23,46));
//        l.add(1,404);
//        System.out.println(l);

//        List<Integer> l2 = new ArrayList<>(Arrays.asList(new Integer[10]));
//        l2.add(4,10);
//        l2.add(7,12);
//        System.out.println(l2);
//        l2.remove(3);
//        l2.removeAll(Collections.singleton(null));
//        System.out.println(l2);
//        System.out.println(l2);

        List<Integer> l4 = new ArrayList<>();
        l4.add(1);l4.add(5);l4.add(7);l4.add(10);
        l4.addAll(2,Arrays.asList(99,98));
        System.out.println(l4);






    }
}