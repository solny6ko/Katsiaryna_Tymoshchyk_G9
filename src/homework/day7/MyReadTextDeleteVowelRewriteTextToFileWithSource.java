package homework.day7;

import java.io.*;

public class MyReadTextDeleteVowelRewriteTextToFileWithSource {
    public void ReadTextDeleteVowelRewriteTextToFileWithSource() {
        String line;
        String lineSwithoutVowel = "";
        String lineSOriginal = "";

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Katarina\\Java\\files\\ReadTextDeleteVowelRewriteTextToFileWithSource.txt"));
            while ((line = in.readLine()) != null) {
                String lineWithoutVowel = line.replaceAll("[aeiouAEIOU]", "");
                lineSwithoutVowel += lineWithoutVowel + "\n";
                lineSOriginal += line + "\n";

            }
            in.close();
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\ReadTextDeleteVowelRewriteTextToFileWithSource.txt"));
            out.write(lineSwithoutVowel + "\n" + lineSOriginal);
            out.close();

        } catch (IOException | NullPointerException e) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {

        MyReadTextDeleteVowelRewriteTextToFileWithSource reWritePhraseWithOriginal = new MyReadTextDeleteVowelRewriteTextToFileWithSource();
        reWritePhraseWithOriginal.ReadTextDeleteVowelRewriteTextToFileWithSource();

    }
}
