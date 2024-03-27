package homework.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MosueTwoHundredEighty {
    public static void main(String[] args) {
// в главном потоке создать коллекцию из 280 мышей, далее создать 5 дочерних потоков (например, в цикле for),
// в каждом из которых удалять 1 пикающую мышь, пока коллекция не станет пустой

        List<Mouse> mice = Collections.synchronizedList(
                IntStream.range(1, 281).boxed().map(Mouse::new).collect(Collectors.toList()));


        IntStream.range(1, 5).forEach(i -> {
            new Thread(() -> {
                while (!mice.isEmpty()) {
                    mice.remove(0).peep();
                }
            }).start();
        });
    }
}

