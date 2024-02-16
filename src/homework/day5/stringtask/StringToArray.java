package homework.day5.stringtask;
// сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста,
// которую принимает на вход в виде аргумента
public class StringToArray {

    String initialString;
    public static void stringToArray(String initialString) {
        char[] array = initialString.toCharArray();
        for (char c : array) {
            System.out.println(c);
        }

    }
}
