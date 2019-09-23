package ua.mycompany.immutable;

public class B {
    private final A a;
    private final String name;

    public B(A a, String name) {
        //NPE
        this.a = copyA(a);
        this.name = name;
    }

    public A getA() {
        return copyA(a);
    }

    public B setA(A a) {
        return new B(a, this.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    private static A copyA(A a) {
        return (a == null) ? null : new A(a.getAge());
    }
}
