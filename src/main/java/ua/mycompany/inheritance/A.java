package ua.mycompany.inheritance;

public class A {
    public static final String HIS_NAME = "Alex";

    public static int age;


    static {
        age = 10;
        System.out.println("static block A 1");
    }

    static {
        System.out.println("static block A 2");
        age = 100;
    }

    private int code = 1;

    public A(int code) {
        this();
        System.out.println("Constructor A with parameters");
        this.code = code;
    }

    {
        code = 10;
        System.out.println("not static block A 1");
    }

    public A() {
        super();
        System.out.println("constructor A without parameters");
    }

    public int getCode() {
        return code;
    }
}
