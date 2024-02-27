package homework.day8.CollectionsMethods;

import homework.day8.initialObjectsClasses.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFurniture {
    public static void main(String[] args) {
//Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно,
// через (Arrays.asList())
        List<Chair> furniture = Arrays.asList(new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));
//Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
        for (Chair furniturinka : furniture) {
            System.out.print(furniturinka.getHeight() * furniturinka.getWidth() + " ");
        }
        System.out.println("");
//Создать пустую карту, где ключом является целое число, а значением объект стула
        Map<Integer, Chair> myChairMap = new HashMap<>();
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < furniture.size(); i++) {
            myChairMap.put(i, furniture.get(i));
        }
//Проитерировать карту и отпечатать ключи в консоль
        for (int key : myChairMap.keySet()) {
            System.out.println(key);

        }
        System.out.println("");
//Проитерировать карту и отпечатать значения в консоль
        for (Chair furniturinka : myChairMap.values()) {
            System.out.println(furniturinka);
        }
        System.out.println("");
//Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Chair> entry : myChairMap.entrySet()) {
            System.out.println(entry);
//            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
    }
}
