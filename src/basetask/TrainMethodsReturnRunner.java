package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args){
        TrainMethodsReturn TrainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод <returnNewInt> вернул " + TrainMethodsReturn.returnNewInt(5));
        System.out.println("метод <returnNewLong> вернул " + TrainMethodsReturn.returnNewLong(12345678910L));
        System.out.println("метод <returnNewChar> вернул " + TrainMethodsReturn.returnNewChar('\u000E'));
        System.out.println("метод <returnNewFloat> вернул " + TrainMethodsReturn.returnNewFloat(0.66f));
        System.out.println("метод <returnNewDouble> вернул " + TrainMethodsReturn.returnNewDouble(1));
        System.out.println("метод <returnNewShort> вернул " + TrainMethodsReturn.returnNewShort((short)1));
        System.out.println("метод <returnNewBoolean> вернул " + TrainMethodsReturn.returnNewBoolean(true));
//        TrainMethodsReturn.TrainMethodsReturn(false);
    }
}
