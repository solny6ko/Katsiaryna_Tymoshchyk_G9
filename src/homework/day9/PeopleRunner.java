package homework.day9;

import homework.day8.initialObjectsClasses.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) {
//Создать поток данных people класса Person (через new Stream.of)
//с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
        Stream<Person> people = Stream.of(new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));
//Отфильтровать людей, которые моложе 60
//Отсортировать в восходящем порядке по именам
//На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст на 4 года больше исходного
//Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл
        System.out.println(people.filter(s -> s.getAge() < 60)
                .sorted(((o1, o2) -> o1.getName().compareTo(o2.getName())))
                .map(s -> new Person(s.getAge() + 4, s.getName()))
                .mapToInt(Person::getAge)
                .average().orElse(0));
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\ReadTextDeleteVowelRewriteTextToFile.txt"));
            out.write(lineSwithoutVowel);
            out.close();

        } catch (IOException | NullPointerException e) {
            System.out.println(e);

        }

    }
}
