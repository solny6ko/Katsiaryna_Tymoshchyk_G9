package homework.day7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyWritePhraseToFile {
    public void WritePhraseToFile() {

        Scanner scanner = new Scanner(System.in);
        String incoming = scanner.nextLine();
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\WritePhraseToFile.txt"));
            out.write("Hello, I just got " + incoming + " from you!");
            out.close();
        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public static void main(String[] args) {

        MyWritePhraseToFile writePhrase = new MyWritePhraseToFile();
        writePhrase.WritePhraseToFile();

    }


}
