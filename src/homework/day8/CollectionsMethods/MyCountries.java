package homework.day8.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class MyCountries {
    public static void main(String[] args) {
        int countriesCount = 0;
//Создать пустой список стрингов countries (через new ArrayList)
        List<String> countries = new ArrayList<>();
//Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

//Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
        for (String city : countries) {
            System.out.print(city + " ");
        }
        System.out.println("");
//Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).length() < 7) {
                countriesCount++;
            }
        }
        System.out.println(countriesCount);
//Проитерировать список по индексу и отпечатать слова в консоль с новой строки
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
