package homework.day9;

import homework.day8.initialObjectsClasses.Bubble;
import homework.day8.initialObjectsClasses.Chair;
import homework.day8.initialObjectsClasses.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Random;

public class ChairRunner {
    public static void main(String[] args) {
//Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
//высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно
        Stream<Chair> chairStream = Stream.of(
                new Chair(120, 40),
                new Chair(100, 30),
                new Chair(100, 50),
                new Chair(110, 45));
//Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50
//Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке
//На основании существующего потока данных создать новый,
// в котором каждый новый Chair имеет высоту, деленную на 2,
// и ширину, умноженную на случайное число от 3 до 8 включительно
//На основании получившегося потока данных создать новый,
// представляющий собой уникальный набо высот стульев умноженных на их ширину
//Найти наибольшее значение в получившемся потоке
//Создать новый обьект Bubble с обьемом равным найденному наибольшему значению
// и именем равным найденному наибольшему значению, представленным в виде словесного
// выражения каждой цифры числа этого значения, указанного чере пробел
//Напечатать строковое значение полученного обьекта в текстовый файл
        chairStream.filter(s -> s.getHeight() >= 100 && s.getWidth() <= 50)
                .sorted(Comparator
                        .comparing(Chair::getHeight)
                        .thenComparing(Comparator.comparing(Chair::getWidth).reversed()))
                .map(s -> new Chair(s.getHeight() / 2, s.getWidth() * (new Random().nextInt(6) + 3)))
                .map(s -> new Chair(s.getHeight() * s.getHeight(), s.getWidth()))
                .mapToInt(Chair::getHeight)
                .max()
//                .collect(Collectors.toMap(s->s, s->s.toString().split("")))
                .stream().mapToObj(v -> {
                    String bubbleName = "";
                    char[] bubblesNameChars = String.valueOf(v).toCharArray();
                    for (char a : bubblesNameChars) {
                        switch (a) {
                            case '0':
                                bubbleName += "ноль" + " ";
                                break;
                            case '1':
                                bubbleName += "один" + " ";
                                break;
                            case '2':
                                bubbleName += "два" + " ";
                                break;
                            case '3':
                                bubbleName += "три" + " ";
                                break;
                            case '4':
                                bubbleName += "четыре" + " ";
                                break;
                            case '5':
                                bubbleName += "пять" + " ";
                                break;
                            case '6':
                                bubbleName += "шесть" + " ";
                                break;
                            case '7':
                                bubbleName += "семь" + " ";
                                break;
                            case '8':
                                bubbleName += "восемь" + " ";
                                break;
                            case '9':
                                bubbleName += "девять" + " ";
                                break;
                        }
                    }
                    return new Bubble(v, bubbleName.trim());

                })
                .forEach(bubble -> {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\Bubble.txt"));
                        String bubbleObject = bubble.toString();
                        out.write(bubbleObject);
                        out.close();

                    } catch (IOException | NullPointerException e) {
                        System.out.println(e);

                    }
                });

    }
}
