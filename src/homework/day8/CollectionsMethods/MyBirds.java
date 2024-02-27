package homework.day8.CollectionsMethods;

import java.util.Arrays;
import java.util.List;

public class MyBirds {
    public static void main(String[] args) {
        int countbBirdWith2andMoreVowel = 0;
//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        String birdsArray[] = new String[]{"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        List<String> birds = Arrays.asList(birdsArray);

//Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }
//Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        for (String bird : birds) {
            int countVowels = 0;
            for (int i = 0; i < bird.length(); i++) {
                if (bird.charAt(i) == 'а' || bird.charAt(i) == 'о' || bird.charAt(i) == 'у' || bird.charAt(i) == 'э' || bird.charAt(i) == 'ы' || bird.charAt(i) == 'я' || bird.charAt(i) == 'ё' || bird.charAt(i) == 'ю' || bird.charAt(i) == 'е' || bird.charAt(i) == 'и')
                    countVowels++;
            }
            if (countVowels > 1) {
                countbBirdWith2andMoreVowel++;
            }
        }
        System.out.println(countbBirdWith2andMoreVowel + " птиц содержат больше 1 гласной");


//Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println("");


//Заменить 3-й элемент списка на Синица
        birds.set(2, "Синица");

//Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
