package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
        Stream<String> streamFigures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
//Заменить каждое слово на целое число, соответствующее количеству буков в слове
//Отфильтровать числа, которые больше 4
//Отпечатать все оставшиеся числа в консоль
        streamFigures
                .map(String::length)
                .filter(length -> length > 4)
                .forEach(System.out::println);
    }
}