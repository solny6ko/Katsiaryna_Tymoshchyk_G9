package classwork.day8;

import java.util.ArrayList;
import java.util.List;


public class MyArrayList {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String[] toWords = "мама мыла раму мыла".split(" ");
        for (String toWord : toWords) {
            myList.add(toWord);
        }
        System.out.println(myList);


// Итерация списка по индексу и вывод элементов списка в консоль
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

// Итерация списка for-each и вывод элементов списка в консоль
        for (String toWord : myList) {
            System.out.println(toWord);
        }


    }
}

