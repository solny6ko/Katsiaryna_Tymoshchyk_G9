package basetask;

public class TrainMethodsIf {
    public int returnNewInt(int intVal) {
        int result;
        if (intVal < 8) {
            result = intVal * 7;
        } else {
            result = intVal / 4;
        }
        return result;

    }

    public long returnNewLong(long longVal) {
        long longResult;
        if (Long.valueOf(longVal) < 300) {
            longResult = Long.valueOf(longVal) - 300;
        } else {
            longResult = Long.valueOf(longVal) + 20;
        }
        return longResult;
    }

    public String returnNewChar(char charVal) {
        String charResult;
        String charToString = Character.toString(charVal);
        if (charToString.equals("g")) {
            charResult = charToString.concat("o");
        } else {
            charResult = "o".concat(charToString);
        }
        return charResult;
    }

    public float returnNewFloat(float floatVal) {
        float floatResult;
        if (floatVal == 0.67f) {
            floatResult = floatVal;
        } else {
            floatResult = floatVal * 2;
        }
        return floatResult;
    }

    public double returnNewDouble(double doubleVal) {
        double doubleResult;
        if (doubleVal > 30.0 & doubleVal < 80.0) {
            doubleResult = doubleVal + 87.0;
        } else if (doubleVal > 80.0 & doubleVal < 400.0) {
            doubleResult = doubleVal - 87.0;
        } else if (doubleVal > 400.0) {
            doubleResult = doubleVal / 4.0;
        } else {
            doubleResult = doubleVal;
        }

        return doubleResult;
    }

    public void returnNewBoolean(boolean boolVal) {
        if (boolVal == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }

    }

}
