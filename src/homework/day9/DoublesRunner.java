package homework.day9;

import homework.day8.initialObjectsClasses.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.round;

public class DoublesRunner {
    public static void main(String[] args) {
//Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
        Stream<Double> doublesStream = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
//Округлить каждое число до целого
//На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами от 0 до числа из иходного потока данных
//Убрать дубликаты значений
//Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
//создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
//Отпечатать в консоль каждый из обьектов нового потока с новой строки
//Найти общий обьем полученного потока пузырьков и отпечатать в консоль
        System.out.println(doublesStream.map(s -> (int) round(s))
                .map(s -> {
                    Random random = new Random();
                    return random.nextInt(0, s + 1);
                })
                .distinct()
                .map(s -> {
                    Bubble[] bubbles = new Bubble[s];
                    for (int i = 0; i < bubbles.length; i++) {
                        bubbles[i] = new Bubble(s, "Bubble vol -" + s);
                    }
                    return bubbles;
                })
                .peek(s -> System.out.println(Arrays.toString(s)))
                .flatMap(Arrays::stream)
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}
