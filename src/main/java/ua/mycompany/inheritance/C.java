package ua.mycompany.inheritance;

public class C {

    protected int n;

    public C(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void method(String message){
        System.out.println(message);
    }

    public void method(String message, int n){

    }

    public void method(){

    }

    public static void methodStatic(){
        System.out.println("Static class C");
    }
}
