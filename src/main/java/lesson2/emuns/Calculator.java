package lesson2.emuns;

public final class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULT = "*";
    private static final String DIV = "/";

    private Calculator() {
        throw new RuntimeException("utility class");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static int calc1(int arg1, String operator, int arg2) {
        if (PLUS.equals(operator)) {
            return arg1 + arg2;
        }
        if (MINUS.equals(operator)) {
            return arg1 - arg2;
        }
        if (MULT.equals(operator)) {
            return arg1 * arg2;
        }
        if (DIV.equals(operator)) {
            return arg1 / arg2;
        } else {
            throw new RuntimeException();
        }
    }

    // 10  null 2
    public static int calc2(int arg1, String operator, int arg2) {
        if(operator == null){
            throw new RuntimeException("Operator is null");
        }

        switch (operator) {
            case PLUS:
                return arg1 + arg2;
            case MINUS:
                return arg1 - arg2;
            case MULT:
                return arg1 * arg2;
            case DIV:
                return arg1 / arg2;
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
