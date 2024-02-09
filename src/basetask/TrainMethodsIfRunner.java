package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args){
        TrainMethodsIf TrainMethodsIf = new TrainMethodsIf();
        System.out.println("метод <returnNewInt> вернул " + TrainMethodsIf.returnNewInt(5));
        System.out.println("метод <returnNewLong> вернул " + TrainMethodsIf.returnNewLong(12345678910L));
        System.out.println("метод <returnNewChar> вернул " + TrainMethodsIf.returnNewChar('\u000E'));
        System.out.println("метод <returnNewFloat> вернул " + TrainMethodsIf.returnNewFloat(0.66f));
        System.out.println("метод <returnNewDouble> вернул " + TrainMethodsIf.returnNewDouble(1));
        TrainMethodsIf.returnNewBoolean(false);
    }
}
