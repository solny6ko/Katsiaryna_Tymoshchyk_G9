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

//метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного массива
    //(подается на вход этого метода), которые больше, чем число n
    // где n - целое число, передаваемое в сигнатуру этого метода,
    //элементы в результирующем массиве должны быть расположены в обратном порядке

    public void selectedElementsAreGraterThanNReverse(int elementNumber, int[] yourArray) {

//        считаем количество элементов которые больше elementNumber
        int sum = 0;
        for (int i = 0; i < yourArray.length; i++) {
            if (yourArray[i] > elementNumber) {
                sum += 1;
            }
        }
//          создаем массив длины sum
        int[] resultArray = new int[sum];

//Начиная с конца исходного массива проверяем, какие элементы исходного массива больше указанного числа elementNumber
// и записываем их в новый массив
        System.out.println("Elements in reverse order which are grater than " + elementNumber + ": ");
        int resultArrayIndex = 0;
        for (int i = yourArray.length - 1; i >= 0; i--) {
            if (yourArray[i] > elementNumber) {
                resultArray[resultArrayIndex] = yourArray[i];
                System.out.print(resultArray[resultArrayIndex] + " ");
                resultArrayIndex++;
            }
        }
        System.out.println("");

    }
//       написать метод, который вернет сумму тех элементов целочисленного массива,
//       которые кратны числу текущего месяца (массив подается в сигнатуру метода)

    public void sumOfElementsMultipleOfDayOfCurrentMonth(int[] yourArray) {
        Date current = new Date();
        int currentDate = current.getDate();
        System.out.println("Today's date is " + current.getDate());
        int sum = 0;
        for (int i = 0; i < yourArray.length; i++) {
            if (yourArray[i] % currentDate == 0) {
                sum += yourArray[i];
            }

        }
        System.out.println("Sum of all array elements multiple to today's date " + currentDate + " is equal to " + sum);

    }

//    -- написать метод, который "нарисует" в консоли следующий рисунок:
//
//	  ^__^
//	  (oo)\\_______
//	 (__)\ ) \/\  \
//	      ||----w |\
//	      ||     ||

    public void printNiceCowToConsole() {
        System.out.println("" + '\n' + '\t' + "  ^__^" + '\n' + '\t' + "  (oo)" + '\\' + '\\' + "_______" + '\n' + '\t' + " (__)" + '\\' + " ) " + '\\' + "/" + '\\' + "  " + '\\' + '\n' + '\t' + '\t' + "  ||----w |" + '\\' + '\n' + '\t' + '\t' + "  ||     ||");
    }
}
