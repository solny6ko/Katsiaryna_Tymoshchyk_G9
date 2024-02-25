package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListAndMyLinkedListDifferenceinTime {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("1" + i);
        }

        System.out.println("Time for ArrayList is " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("1" + i);
        }

        System.out.println("Time for LinkedList is " + (System.currentTimeMillis() - t0));
    }
}
