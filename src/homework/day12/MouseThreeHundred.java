package homework.day12;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MouseThreeHundred {
    // в главном потоке создать коллекцию из 380 мышей, далее создать 7 дочерних потоков
// (например, в цикле for), в каждом из которых каджые 250мс удалять 1 пикающую мышь,
// пока коллекция не станет пустой
    public static void main(String[] args) {

        List<Mouse> mice = Collections.synchronizedList(
                IntStream.range(1, 381).boxed().map(Mouse::new).collect(Collectors.toList()));


        IntStream.range(1, 7).forEach(i -> {
            new Thread(() -> {
                while (!mice.isEmpty()) {
                    mice.remove(0).peep();
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        });
    }
}
