package classwork.day8;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        String[] toWords = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < toWords.length; i++) {
            myMap.put(i, toWords[i]);
        }

        for (int key : myMap.keySet()) {
            System.out.println(key);

        }

        for (String value : myMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }


    }
}
