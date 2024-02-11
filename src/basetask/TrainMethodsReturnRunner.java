package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод <returnNewInt> вернул " + trainMethodsReturn.returnNewInt(5));
        System.out.println("метод <returnNewLong> вернул " + trainMethodsReturn.returnNewLong(12345678910L));
        System.out.println("метод <returnNewChar> вернул " + trainMethodsReturn.returnNewChar('\u000E'));
        System.out.println("метод <returnNewFloat> вернул " + trainMethodsReturn.returnNewFloat(0.66f));
        System.out.println("метод <returnNewDouble> вернул " + trainMethodsReturn.returnNewDouble(1));
        System.out.println("метод <returnNewShort> вернул " + trainMethodsReturn.returnNewShort((short) 1));
        System.out.println("метод <returnNewBoolean> вернул " + trainMethodsReturn.returnNewBoolean(true));
//        TrainMethodsReturn.TrainMethodsReturn(false);
    }
}
