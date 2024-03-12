package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class MouseSevenThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                List<Mouse> mice = new ArrayList<>();
                for (int j = 1; j < 19; j++) {
                    mice.add(new Mouse(j));
                }
                for (Mouse mouse : mice) {
                    if ((mice.indexOf(mouse) + 1) % 2 == 0) {
                        mouse.peep();
                    }
                }
            }).start();
        }
    }
}
