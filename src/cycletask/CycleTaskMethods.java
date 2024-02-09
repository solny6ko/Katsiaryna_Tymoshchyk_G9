package cycletask;

import java.util.Random;


//используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
public class CycleTaskMethods {
    public void CycleTaskWhile() {
        int i = 0;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
    }

    //используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
    public void CycleTaskFor() {
        int i;
        for (i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }

    //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
    public void CycleTaskArray() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }
        System.out.print("");
    }

    // пройти по массиву и вывести в консоль все элементы
    public void CycleTaskArrayPrint() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }
        System.out.print("");
        for (int i : array) {
            System.out.print(array[i] + "");
        }
        System.out.println();
    }

    //вывести в консоль все элементы массива в обратном порядке
    public void CycleTaskArrayPrintReverse() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println("Reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + "");
        }

    }

    //каждый элемент массива умножить на 5 и вывести результат в консоль
    public void CycleTaskArrayPrintMult() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            array[i] = array[i] * 5;
            System.out.print(array[i] + " ");
        }
    }

// каждый элемент массива возвести в квадрат и вывести результат в консоль

    public void CycleTaskArrayPrintDouble() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            array[i] = array[i] * array[i];
            System.out.print(array[i] + " ");
        }
    }

    //найти минимальный элемент массива и вывести результат в консоль
    public void CycleTaskArrayPrintMin() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }

        int minElement = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("\nminElement: " + minElement);
    }
//поменять местами первый и последний элементы и вывести результат в консоль

    public void CycleTaskArrayPrintSwitch() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }

        if (n > 1) {
            int temp = array[0];
            array[0] = array[n - 1];
            array[n - 1] = temp;
        }


        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");


        }

    }

    // - отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
    public void CycleTaskArrayPrintSorting() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println("Straight: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }

        for (int i =  array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted result:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");


        }

    }

}

