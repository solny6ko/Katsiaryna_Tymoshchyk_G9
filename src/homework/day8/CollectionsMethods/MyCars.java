package homework.day8.CollectionsMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCars {
    public static void main(String[] args) {
//Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди)
// (через new ArrayList)
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

//Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
        for (String car : cars) {
            System.out.println("\"" + car + "\" ");
        }
//Найти и удалить из набора авто, в названии которых больше 4 букв
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Integer wordLength = iterator.next().length();
            if (wordLength > 4) {
                iterator.remove();
            }

        }

// Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String carsReduced : cars) {
            System.out.print(carsReduced + " ");
        }
    }

}
