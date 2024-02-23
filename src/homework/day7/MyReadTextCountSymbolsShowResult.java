package homework.day7;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyReadTextCountSymbolsShowResult {
    public void ReadTextCountSymbolsShowResult() {
        String line;
        int textLength = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Katarina\\Java\\files\\ReadTextCountSymbolsShowResult.txt"));
            while ((line = in.readLine()) != null) {
                int lineLength = line.length();
                textLength += lineLength;
            }
            int totalTextLength = textLength;
            in.close();
            LocalDate nowYear = LocalDate.now();
            LocalTime now = LocalTime.now();
            DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH-mm-ss");
            String dateTimeString = now.format(formatterTime);
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\" + nowYear + "_" + dateTimeString + "_" + totalTextLength + ".txt"));
            out.write(String.valueOf(totalTextLength));
            out.close();

        } catch (IOException | NullPointerException e) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {

        MyReadTextCountSymbolsShowResult readTextCountSymbolsShowResult = new MyReadTextCountSymbolsShowResult();
        readTextCountSymbolsShowResult.ReadTextCountSymbolsShowResult();

    }
}
