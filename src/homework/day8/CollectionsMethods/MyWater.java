package homework.day8.CollectionsMethods;

import homework.day8.initialObjectsClasses.Person;
import homework.day8.initialObjectsClasses.Water;

import java.util.Arrays;
import java.util.List;

public class MyWater {
    public static void main(String[] args) {
//Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная)
// и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки
        for (Water waterinka : water) {
            System.out.println(waterinka.getColor() + " - " + waterinka.getSmell());
        }

    }
}
