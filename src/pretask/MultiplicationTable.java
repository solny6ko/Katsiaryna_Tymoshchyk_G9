package pretask;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= 10; i++) {
            int res = i * a;
            System.out.println(i + "*" + a + "=" + res);
        }
    }
}
