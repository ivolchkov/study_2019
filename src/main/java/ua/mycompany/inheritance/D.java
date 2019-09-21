package ua.mycompany.inheritance;

public class D  extends C{
    private int n;

    public D(int n1, int n2) {
        super(n1);
        this.n = n2;
    }

    @Override
    public int getN() {
        return n;
    }

    @Override
    public void method(String blabla) {
    }

//    public static void methodStatic(){
//        System.out.println("Static class D");
//    }
}
