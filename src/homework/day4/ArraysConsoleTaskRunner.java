package homework.day4;

public class ArraysConsoleTaskRunner {
    public static void main(String[] args) {
        int[] yourArray = {1,4,6,33,30,90,44,86,90,46,74};
        ArraysConsoleTask arraysConsoleTask = new ArraysConsoleTask();
        arraysConsoleTask.sumOfNelements(5,yourArray);
        arraysConsoleTask.selectedElementsAreGraterThanNReverse(40,yourArray);
        arraysConsoleTask.sumOfElementsMultipleOfDayOfCurrentMonth(yourArray);
        arraysConsoleTask.printNiceCowToConsole();


    }
}