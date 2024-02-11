package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(10);
        trainMethodsPrimitive.printLong(12345678910L);
        trainMethodsPrimitive.printChar('\u000E');
        trainMethodsPrimitive.printFloat(7.8f);
        trainMethodsPrimitive.printDouble(123.456);
        trainMethodsPrimitive.printShort((short) 10);
        trainMethodsPrimitive.printByte((byte) 111);
        trainMethodsPrimitive.printBoolean(true);
    }
}
