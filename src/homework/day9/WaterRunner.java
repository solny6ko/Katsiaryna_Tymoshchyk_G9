package homework.day9;

import homework.day8.initialObjectsClasses.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
//Создать поток данных water класса Water (через new Stream.of)
//из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя)
// и запахом (Нет, Нет, Аммиачный, Мятный) соответственно
        Stream<Water> waterStream = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));
//Отфильтровать воду, цвет которой не "Прозрачная"
//Отсортировать в нисходящем порядке по запаху
//На основании существующего потока данных создать новый,
// в котором каждая новая Water имеет запах с удвоенной буквой ы, если такая встречается
//Обьединить запах всех обьектов в одну строку
//Найти количество буков в ней и отпечатаь в консоль
        System.out.println(waterStream
                .filter(s -> !s.getColor().equals("Прозрачная"))
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(s -> new Water(s.getColor(), s.getSmell().replace("ы", "ыы")))
                .map(Water::getSmell)
                .collect(Collectors.joining())
                .length());
    }
}
