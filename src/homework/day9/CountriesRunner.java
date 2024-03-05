package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
//Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
        Stream<String> streamCountries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
//Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//Отфильтровать страны, в названии которых меньше 7 букв
//Перевести все страны в верхний регистр
//Добавить к каждому названию кавычки
//Отпечатать в консоль с новой строки
        streamCountries.filter(s -> s.toLowerCase().
                        matches(".*[аеёиоуыюя].*")).
                filter(s -> s.length() < 7).
                map(String::toUpperCase).
                map(s -> "\"" + s + "\"").
                forEach(System.out::println);
    }
}