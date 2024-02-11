package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int intVal) {
        intVal = intVal * 3;
        return intVal;

    }

    public long returnNewLong(long longVal) {
        long longResult = Long.valueOf(longVal) - 4;
        return longVal;
    }

    public String returnNewChar(char charVal) {
        String charToString = Character.toString(charVal);
        String charResult = charToString.concat(charToString);
        return charResult;
    }

    public float returnNewFloat(float floatVal) {
        float floatResult = floatVal / 2;
        return floatResult;
    }

    public double returnNewDouble(double doubleVal) {
        doubleVal = doubleVal + 8;
        return doubleVal;
    }

//            -- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2

    public short returnNewShort(short shortVal) {
        shortVal = (short) (shortVal - 1);
        return shortVal;
    }

    public boolean returnNewBoolean(boolean boolVal) {
        return !boolVal;
    }
//
//    public void returnNewBoolean(boolean boolVal) {
//        if (boolVal == true) {
//            System.out.println("Я получил на вход значение истины");
//        } else {
//            System.out.println("Я получил на вход ложь");
//        }
//
//    }
}
