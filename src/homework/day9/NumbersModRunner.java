package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
        Stream<Integer> numbersModStream = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки
        numbersModStream
                .map(Object::toString)
                .filter(s -> s.contains("3"))
                .flatMap(s -> Stream.of(s.split("")))
                .map(word -> {
                    if (word.equals("1")) {
                        return word.replaceAll("1", "один");
                    } else if (word.equals("2")) {
                        return word.replaceAll("2", "два");
                    } else if (word.equals("3")) {
                        return word.replaceAll("3", "три");
                    } else if (word.equals("4")) {
                        return word.replaceAll("4", "четыре");
                    } else if (word.equals("5")) {
                        return word.replaceAll("5", "пять");
                    } else if (word.equals("6")) {
                        return word.replaceAll("6", "шесть");
                    } else if (word.equals("7")) {
                        return word.replaceAll("7", "семь");
                    } else if (word.equals("8")) {
                        return word.replaceAll("8", "восемь");
                    } else if (word.equals("9")) {
                        return word.replaceAll("9", "девять");
                    } else {
                        return word.replaceAll("0", "ноль");
                    }
                })
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
