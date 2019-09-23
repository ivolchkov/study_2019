package ua.mycompany;

public final class FactorialUtility {

    private FactorialUtility() {

    }

    //1. loop
    //2. recursion
    //3. long-math n >16



    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    //5!=5*4!=5*4*3!=5*4*3*2!=5*4*3*2*1!=5*4*3*2*1*0!=5*4*3*2*1*1

    public static long factorialRec(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorialRec(n - 1);

        return (n == 0) ? 1 : n * factorialRec(n - 1);
    }
}
