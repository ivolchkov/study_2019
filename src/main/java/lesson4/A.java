package lesson4;

public class A {
    static {
        NAME="";
    }
    private static final String NAME;
    private final int age;
    private static int code;
    public A(int age) throws RuntimeException{
        super();
        this.age = age;
    }

    {
//        throw new RuntimeException();
    }

    public A() throws RuntimeException {
//        super();
//        age = 10;
        this(10);
    }

    public A(int age, int code)throws RuntimeException {
        this(age);
        A.code = code;
    }

    public static final void main(String[] args) {
        A a1 = new A();
//        System.out.println(a1.code);
        A a2 = new A(100,123);
        System.out.println(A.code);
        System.out.println(a1.code);
    }
}
