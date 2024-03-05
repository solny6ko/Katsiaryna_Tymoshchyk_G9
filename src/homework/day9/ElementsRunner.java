package homework.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
//Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
        Stream<String> streamElements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker","Breadcrumb");
//Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное,
// то заменить в нем все буквы "e" на букву "o", а если четное, то заменить слово на число количества буков в этом слове
//Оставить в потоке только уникальные значения
//Отпечатать в консоль с новой строки
        streamElements
                .flatMap(s -> Stream.of(s.split("\\s+")))
                .map(word -> {
                    if (word.length() % 2 == 0) {
                        return String.valueOf(word.length());
                    } else {
                        return word.replaceAll("e", "o");
                    }
                })
                .forEach(System.out::println);
    }
}
