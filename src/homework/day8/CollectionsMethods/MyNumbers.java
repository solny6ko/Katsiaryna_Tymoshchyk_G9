package homework.day8.CollectionsMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyNumbers {
    public static void main(String[] args) {
//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
        Integer numbersArray[] = new Integer[]{3342, 34, 79, 23426, 68, 1324, 55, 7699};
        List<Integer> numbers = Arrays.asList(numbersArray);
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
        for (int number : numbers) {
            System.out.println(number);
        }
//Посчитать сумму всех чисел и вывести результат в консоль
        int totalSum = 0;
        for (int number : numbers) {
            totalSum = totalSum + number;
        }
        System.out.println("Сумма всех чисел равна: " + totalSum);
//Отсортировать список по возрастанию
        Collections.sort(numbers);
        System.out.println("");
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
//Развернуть список в обратном порядке
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("");
//Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
