package ua.mycompany;

import java.util.Arrays;
import java.util.stream.Collectors;

import static ua.mycompany.FactorialUtility.factorial;

public class Main {
    private final static int B = 100;
    private static final int A = 28;

    public static void main(String[] args) {

        // byte, short, int, long
        // char
        // float, double
        // boolean


        byte a = A;
        byte b = B;

        byte c = (byte) (A + B);

        double ai = -10;
        double bi = 0;

//        System.out.println("a+b=" + (ai + bi));
//        System.out.println("a-b=" + (ai - bi));
//        System.out.println("a/b=" + (ai / bi));
//        System.out.println("a*b=" + (ai * bi));
//
//        System.out.println(Math.sqrt(-10));
//
//        char cc = 56;
//        System.out.println(cc);

        System.out.println(factorial(3));

        Arrays.stream(Day.values()).map(x->x.name()).collect(Collectors.toList());
    }
}


enum Day{
    MON,TUE,WEN,THU,FRI,SAT,SUN
}
