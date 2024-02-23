package homework.day7;

import java.util.Scanner;

public class ConsoleTask {

    public void letsCommunicate() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("No")) {
                System.out.println("I am upset");
                System.out.println("");
                break;
            }
            System.out.printf("Hello, I just got '%s' from you!", incoming).println();
        }

    }


    public static void main(String[] args) {

        ConsoleTask talk = new ConsoleTask();
        talk.letsCommunicate();

    }
}
