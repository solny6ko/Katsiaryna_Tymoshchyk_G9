package homework.day5.stringtask;
//1.3 сделать метод, который позволяет найти в тексте все цифры и преобразовать их в массив числовых переменных,
//вывести все элементы массива в косоль, текст получает на вход в виде аргумента

import static java.util.regex.Pattern.matches;

public class DigitsToArray {
    String initialString;

    public static void digitsToArray(String initialString) {
        char[] arrayOfChars = initialString.toCharArray();
        int count = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            String newString = String.valueOf(arrayOfChars[i]);
            if (newString.matches("[0-9]+")) {
                count += 1;
            }
        }
        int resultArrayIndex = 0;
        int[] arrayOfInt = new int[count];
        for (int i = 0; i < arrayOfChars.length; i++) {
            String newString = String.valueOf(arrayOfChars[i]);
            if (newString.matches("[0-9]+")) {
                arrayOfInt[resultArrayIndex] = Integer.valueOf(newString);
                resultArrayIndex++;
            }
        }
        for (int j = 0; j < arrayOfInt.length; j++) {
            System.out.print(arrayOfInt[j] + " ");
        }
    }
}
