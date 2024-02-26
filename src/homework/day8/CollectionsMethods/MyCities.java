package homework.day8.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class MyCities {
    public static void main(String[] args) {
//Создать пустой список стрингов cities (через new ArrayList)
        List<String> cities = new ArrayList<>();
//Добавить в список 3 города (Минск, Москва, Берлин)
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        int lettersCount = 0;
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
        for (String city : cities) {
            System.out.println(city);
        }
//Посчитать сумму всех буков во всех словах и вывести число в консоль
        for (int i = 0; i < cities.size(); i++){
            lettersCount = lettersCount + cities.get(i).length();
        }
        System.out.println(lettersCount);
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
