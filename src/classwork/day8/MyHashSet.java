package classwork.day8;

import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        String[] toWords = "мама мыла раму мыла".split(" ");
        for (String toWord : toWords) {
            myHashSet.add(toWord);
        }
        System.out.println(myHashSet);


// Итерация списка через итератор и вывод элементов set-a в консоль
        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

// Итерация списка for-each и вывод элементов set-a в консоль
        for (String toWord : myHashSet) {
            System.out.println(toWord);
        }
    }
}
