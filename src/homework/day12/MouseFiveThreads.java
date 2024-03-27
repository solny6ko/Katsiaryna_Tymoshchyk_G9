package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class MouseFiveThreads {
//    - создать 5 одновременно запускающихся потоков (например, в цикле for),
//    в каждом из которых, проитерировать коллекцию из 20 мышей, где каждая пикает
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                List<Mouse> mice = new ArrayList<>();
                for (int j = 1; j < 21; j++) {
                    mice.add(new Mouse(j));
                }
                for (Mouse mouse : mice) {
                    mouse.peep();
                }
            }).start();
        }
    }
}
