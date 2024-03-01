package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
//Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
        Stream<Integer> numbersStream = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
//В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//Отсортировать и снова отпечатать в консоль с новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
        System.out.print(numbersStream.peek(System.out::println)
                .sorted()
                .peek(System.out::println)
                .reduce(0, Integer::sum));

    }
}
