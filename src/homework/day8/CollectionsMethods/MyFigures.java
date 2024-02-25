package homework.day8.CollectionsMethods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFigures {
    public static void main(String[] args) {
//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
        String figuresArray[] = new String[]{"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        List<String> figures = Arrays.asList(figuresArray);
        int countI = 0;

//Проитерировать список через for-each и отпечатать слова в файл figures через тире

        String figuresToString = "";

        for (String figure : figures) {
            if (figures.indexOf(figure) != figures.size() - 1) {
                figuresToString += figure + "-";
            } else {
                figuresToString += figure;
            }
        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\figures.txt"));
            out.write(figuresToString);
            out.close();
        } catch (IOException | RuntimeException e) {
            System.out.println(e);

        }
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль

        for (String figure : figures) {
            if (figure.contains("и")) {
               countI++;
            }

        }
        System.out.println(figures.size() - countI);

//Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

//Вставить на 3 позицию Треугольник
        figures.set(2, "Треугольник");

        System.out.println("");


//Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String figuresExtended : figures) {
            System.out.print(figuresExtended  + " ");
        }

    }
}
