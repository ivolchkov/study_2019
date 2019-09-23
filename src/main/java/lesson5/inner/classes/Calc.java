package lesson5.inner.classes;

import java.util.HashMap;
import java.util.Map;

public class Calc {
   private final static Map<String, Calculation> OPERATION_TO_CALCULATION = new HashMap<>();

    static {
        OPERATION_TO_CALCULATION.put("+", (a, b) -> a + b);
        OPERATION_TO_CALCULATION.put("-", (a, b) -> a - b);
    }


    public int calcOperation(int arg1, String operation, int arg2) {
        return OPERATION_TO_CALCULATION.get(operation).calc(arg1, arg2);
    }

    //enum
    private static interface Calculation {
        int calc(int arg1, int arg2);
    }
}
