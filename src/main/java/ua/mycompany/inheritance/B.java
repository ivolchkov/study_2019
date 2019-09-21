package ua.mycompany.inheritance;

public class B extends A {
    private int n;
    static {
        System.out.println("static block B");
    }

    {
        System.out.println("Not static block B");
    }

    public B() {
        super(10);
        System.out.println("constructor B");
    }

    public B(int code, int n) {
        super(code);// this
        this.n = n;
    }
}
