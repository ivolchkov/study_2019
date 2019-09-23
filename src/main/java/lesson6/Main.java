package lesson6;

import java.io.IOException;

public class Main {
}
class A{
    void method(){}
}
class B extends A{
    @Override
    void method() throws RuntimeException {
        super.method();
    }
}
