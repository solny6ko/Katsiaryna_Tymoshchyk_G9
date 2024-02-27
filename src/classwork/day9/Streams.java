package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int x = 0;
        for (String listik : list) {
            if (listik.equals("мама")) {
                x++;
            }
        }
        System.out.println(x);

        long count = list.stream().filter("мама"::equalsIgnoreCase).count();
//        long count = list.stream().filter(s -> "мама".equalsIgnoreCase(s)).count(); без ссылки на метод
        System.out.println(count);
        long count2 = list.stream().filter(s -> s.contains("м") && s.contains("а")).count();
        System.out.println(count2);
        long count3 = list.stream().skip(2).filter(s -> s.contains("м") && s.contains("а")).count();
        System.out.println(count3);

//1 Вернуть первый элемент или "мама", если коллекция пуста
        String firstEntry = list.stream().findFirst().orElse("мама");
        System.out.println(firstEntry);
//2 Вернуть первый элемент равный мама
        String firstElement = list.stream().filter("мама"::equalsIgnoreCase).findFirst().get();
        System.out.println(firstElement);
//3 Вернуть пятый элемент коллекции по порядку
        List<String> fifthElement = list.stream().skip(4).collect(Collectors.toList());
        System.out.println(fifthElement);
//4 Вернуть коллекцию из двух элементов, начиная с третьего
        List<String> twoElements = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(twoElements);
//5 Выбрать коллекцию из уникальных строк, содержащих "м"
        List<String> distinctElements = list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(distinctElements);

    }


}
