package homework.day5.stringtask;
//сделать метод, который позволяет найти и вывести в консоль все дубликаты слов в строке текста,
//который принимает на вход в виде аргумента.

public class StringWordDuplicates {
    String initialString;

    public static void stringWordDuplicates(String initialString) {
        initialString = initialString.toLowerCase();
        String[] stringToWords = initialString.split("[,!? ():]+");
        for (String word : stringToWords) {
//            System.out.println(word);
        }
        for (int i = 0; i < stringToWords.length; i++) {
            for (int j = i + 1; j < stringToWords.length; j++) {
                if (stringToWords[i].equals(stringToWords[j])) {
                    System.out.println(stringToWords[i]);
                }
            }

        }
    }
}