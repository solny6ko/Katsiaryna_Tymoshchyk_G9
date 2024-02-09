package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args){
        TrainMethodsPrimitive TrainMethodsPrimitive = new TrainMethodsPrimitive();
        TrainMethodsPrimitive.printInt(10);
        TrainMethodsPrimitive.printLong(12345678910L);
        TrainMethodsPrimitive.printChar('\u000E');
        TrainMethodsPrimitive.printFloat(7.8f);
        TrainMethodsPrimitive.printDouble(123.456);
        TrainMethodsPrimitive.printShort((short)10);
        TrainMethodsPrimitive.printByte((byte)111);
        TrainMethodsPrimitive.printBoolean(true);
    }
}
