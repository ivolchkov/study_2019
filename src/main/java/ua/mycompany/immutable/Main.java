package ua.mycompany.immutable;

public class Main {
    public static void main(String[] args) {
        A a = new A(10);
        String alex1 = "Alex";
        B alex = new B(a, alex1);

        System.out.println(alex);
        a.setAge(100);
        System.out.println(alex);
        A a1 = alex.getA();
        a1.setAge(200);
        alex1 = alex1 + "11";
        System.out.println(alex);


    }
}
