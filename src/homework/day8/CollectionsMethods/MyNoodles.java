package homework.day8.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {
    public static void main(String[] args) {
//Создать пустой список стрингов noodles (через new ArrayList)
        List<String> noodles = new ArrayList<>();

//Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

//Проитерировать список через for-each и отпечатать слова в консоль через тире
        String noodlesToString = "";
        for (String noodle : noodles) {
            if (noodles.indexOf(noodle) != noodles.size() - 1) {
                noodlesToString += noodle + "-";
            } else {
                noodlesToString += noodle;
            }
        }
        System.out.println(noodlesToString);

//Заменить в каждом слове буквы "а" на букву "о"
        for (int i = 0; i < noodles.size(); i++) {
            String noodle1 = noodles.get(i).replace('a', 'o');
            noodles.set(i, noodle1);
        }

//Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }

    }
}
