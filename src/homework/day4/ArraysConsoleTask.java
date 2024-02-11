package homework.day4;

import java.util.Date;

public class ArraysConsoleTask {
    //метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
    //где n - целое число, передаваемое в сигнатуру этого метода
    public void sumOfNelements(int elementNumber, int[] yourArray) {
        int sum = 0;
        for (int i = elementNumber - 1; i < yourArray.length; i += elementNumber) {
            sum += yourArray[i];
        }
        System.out.println("Sum of all " + elementNumber + "th elements is equal to " + sum);

    }



}
