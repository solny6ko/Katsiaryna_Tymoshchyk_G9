package homework.day8.CollectionsMethods;

import homework.day8.initialObjectsClasses.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySandbox {
    public static void main(String[] args) {
//Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        List<Sand> sandbox = new ArrayList<>();
//Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));
//Проитерировать список через for-each и отпечатать вес в консоль через пробел
        for (Sand sendinka : sandbox) {
            System.out.print(sendinka.getWeight() + " ");
        }
        System.out.println("");
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Sand sendinka : sandbox) {
            System.out.print(sendinka.getName() + " ");
        }
        System.out.println("");
//Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> mySandMap = new HashMap<>();
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < sandbox.size(); i++) {
            mySandMap.put(i, sandbox.get(i));
        }
//Проитерировать карту и отпечатать ключи в консоль
        for (int key : mySandMap.keySet()) {
            System.out.println(key);

        }
        System.out.println("");
//Проитерировать карту и отпечатать значения в консоль
        for (Sand sendinka : mySandMap.values()) {
            System.out.println(sendinka);
        }
        System.out.println("");
//Проитерировать карту и отпечатать пары ключ-значение в консоль

        for (Map.Entry<Integer, Sand> entry: mySandMap.entrySet()){
            System.out.println(entry);
//            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
    }
}
