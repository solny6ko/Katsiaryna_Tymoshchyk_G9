package classwork.day12;

public class TheOtherThingAboutThreads {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s  ", i);
            }
        }).start();
        for (int i = 0; i < 3; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("m-%s  ", i);
        }
    }
}