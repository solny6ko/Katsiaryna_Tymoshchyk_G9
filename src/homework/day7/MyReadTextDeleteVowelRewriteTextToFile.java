package homework.day7;

import java.io.*;

public class MyReadTextDeleteVowelRewriteTextToFile {
    public void ReadTextDeleteVowelRewriteTextToFile() {
        String line;
        String lineSwithoutVowel = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Katarina\\Java\\files\\ReadTextDeleteVowelRewriteTextToFile.txt"));
            while ((line = in.readLine()) != null) {
                String lineWithoutVowel = line.replaceAll("[aeiouAEIOU]", "");
                lineSwithoutVowel += lineWithoutVowel + "\n";

            }
            in.close();
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\ReadTextDeleteVowelRewriteTextToFile.txt"));
            out.write(lineSwithoutVowel);
            out.close();

        } catch (IOException | NullPointerException e) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {

        MyReadTextDeleteVowelRewriteTextToFile reWritePhrase = new MyReadTextDeleteVowelRewriteTextToFile();
        reWritePhrase.ReadTextDeleteVowelRewriteTextToFile();

    }
}
