package lesson3.interfaces.annonim;

public class Main {
    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public int method() {
                return 0;
            }

            @Override
            public void hello() {
                System.out.println("Hi");
            }
        };
        ai.hello();

        MyClass myClass = new MyClass(100) {


            @Override
            public void hello() {
                super.hello();
                System.out.println("hello");
            }

            public void method() {
                System.out.println("method");
            }
        };

        System.out.println(myClass.getClass().getName());
//        myClass.method();


        MyClass myClassBetter = new MyClassBetter();
        ((MyClassBetter) myClassBetter).method();
    }
}
