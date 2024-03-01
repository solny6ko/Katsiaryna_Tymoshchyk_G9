package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
    public static void main(String[] args) {
//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--
        Stream.of(birds.stream()
                        .map(s -> s.replace("о", "а"))
                        .map(s -> s.toLowerCase())
                        .collect(Collectors.joining()))
                .map(s -> s.replace("ь", ""))
                .flatMap(s -> Arrays.stream(s.split("б")))
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .map(s -> "--" + s + "--")
                .forEach(System.out::println);
    }
}