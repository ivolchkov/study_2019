package lesson4;

public class Main {
    public static void main(String... args) {
        System.out.println(method(0,1));
        method(1D);
    }

    public static int method(int a, int... arr){
        return 0;
    }

    public static int method(int a){
        return 1;
    }

    public static int method(int a, int b){
        return 2;
    }

    public static int method(int a, Integer b){
        return 2;
    }

//    public static int method(int...arr, int a){}

    public static void method(Object object){
        System.out.println("Object");
    }

    public static void method(Number object){
        System.out.println("Number");
    }

    public static void method(Integer object){
        System.out.println("Integer");
    }
}
