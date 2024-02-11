package basetask;

public class TrainMethodsPrimitive {
    public void printInt(int value) {
        System.out.println("я получил на вход число " + value);
    }

    public void printLong(long longVal) {
        System.out.println("я получил на вход длинное число " + Long.valueOf(longVal));
    }

    public void printChar(char charVal) {
        System.out.println("я получил на вход символ " + Character.toString(charVal));
    }

    public void printFloat(float floatVal) {
        System.out.println("я получил на вход дробное число " + floatVal);
    }

    public void printDouble(double doubleVal) {
        System.out.println("я получил на вход длинное дробное число " + doubleVal);
    }

    public void printShort(short shortVal) {
        System.out.println("я получил на вход короткое число " + shortVal);
    }

    public void printByte(byte byteVal) {
        System.out.println("я получил на вход очень короткое число " + byteVal);
    }

    public void printBoolean(boolean boolVal) {
        System.out.println("я получил на вход булево " + boolVal);
    }
}
