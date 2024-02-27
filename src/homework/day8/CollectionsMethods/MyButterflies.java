package homework.day8.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class MyButterflies {
    public static void main(String[] args) {
//Создать пустой список стрингов butterflies (через new ArrayList)
        List<String> butterflies = new ArrayList<>();
//Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        int countO = 0;
//Проитерировать список через for-each и отпечатать слова в консоль в кавычках
        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\" ");
        }
        System.out.println("");
//Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                countO++;
            }
        }
        System.out.println(countO);
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
//Проитерировать список через for-each и отпечатать слова в консоль через перенос строки
        for (String butterfly2 : butterflies) {
            System.out.println("\n" + butterfly2);
        }


    }
}
