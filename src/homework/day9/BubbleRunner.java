package homework.day9;

import homework.day8.initialObjectsClasses.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubbleRunner {
    public static void main(String[] args) {
//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5)
// и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
        List<Bubble> bubblesArray = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));
//В потоке данных отфельтровать только те пузыри, обьем которых больше 3
//Отсортировать данные по имени в восходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет обьем в 3 раза больше исходного
//Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль
        System.out.println(bubblesArray.stream()
                .filter(s -> s.getVolume() > 3)
                .sorted(Comparator.comparing(Bubble::getName))
                .map(s -> new Bubble((s.getVolume() * 3), (s.getName())))
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}
