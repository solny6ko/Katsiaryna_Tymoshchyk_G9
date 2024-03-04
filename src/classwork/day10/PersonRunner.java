package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> peopleList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        long count = peopleList.stream()
                .filter(s -> s.age >= 18)
                .filter(s -> (s.sex == (Person.Sex.WOMEN) && (s.age < 55)) || (s.sex == Person.Sex.MAN && s.age < 60))
                .count();
        System.out.println(count);

//        Задание 1  Отсортировать коллекцию строк по алфавиту
        List<String> streamElements = List.of("Text field", "Radio", "Check-box", "Radio", "Drop-down", "Picker", "Breadcrumb");

        streamElements.stream().sorted().forEach(System.out::println);

//        Задание 2  Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать
// дубликат
        streamElements.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

//        Задание 3 Отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести
//результат в консоль и вернуть результирующую коллекцию
        peopleList.stream()
                .sorted((p1, p2) -> {
                    if (p1.getSex() != p2.getSex()) {
                        return p1.getSex().compareTo(p2.getSex());

                    } else {
                        return p1.getAge() - p2.getAge();
                    }
                })
                .peek(p -> System.out.println(p.toString())).collect(Collectors.toList());
    }
}
