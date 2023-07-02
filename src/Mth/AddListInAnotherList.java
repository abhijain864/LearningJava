package Mth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddListInAnotherList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);

        List<Integer> list2 = Arrays.asList(4,5,6);
//        list2.add(4);
//        list2.add(5);
//        list2.add(6);

        int index = 1;
        list1.addAll(index, list2);

        System.out.println("List 1: " + list1);
    }
}
