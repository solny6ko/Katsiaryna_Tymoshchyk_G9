package homework.day8.CollectionsMethods;

import java.util.Arrays;
import java.util.List;

public class MyDoubles {
    public static void main(String[] args) {
//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
        Double doublesArray[] = new Double[]{33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        List<Double> doubles = Arrays.asList(doublesArray);
//Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (Double doubleTrouble : doubles) {
            System.out.print(doubleTrouble + " ");
        }
        System.out.println("");
//Посчитать произведение всех чисел и вывести результат в консоль
        double totalMult = 1.0;
        for (Double doubleTrouble : doubles) {
            totalMult = totalMult * doubleTrouble;
        }
        System.out.println("Произведение всех чисел: " + totalMult);
        System.out.println("");
//найти сумму всех дробных частей и вывести результат в консоль
        double totalSumOfFractions = 0.0;
        for (Double doubleTrouble : doubles) {
            Integer intPartOfDouble = doubleTrouble.intValue();
            Double fractionPart = doubleTrouble - intPartOfDouble;
            totalSumOfFractions = totalSumOfFractions + fractionPart;
        }
        System.out.println("Сумма всех дробных частей: " + totalSumOfFractions);
        System.out.println("");

//Проитерировать список по индексу и вывести целые части в консоль через пробел
        for (int i = 0; i < doubles.size(); i++) {
            Integer intPartOfDouble = doubles.get(i).intValue();
            System.out.print(intPartOfDouble + " ");
        }
    }
}
