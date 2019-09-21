package ua.mycompany.inheritance;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        D d = new D(1, 2);
        System.out.println(d.getN());

        C c = new C(1);
        C.methodStatic();
        c.methodStatic();
    }
}
