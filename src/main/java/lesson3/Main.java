package lesson3;

import lesson3.abstractclass.Shape;
import lesson3.inheritance.User;
import lesson3.singlton.Singleton1;

public class Main {
    public static void main(String[] args) {

//        User user = new User("Ivanov","Ivan",
//////                "ivaniv@gmail.com","password");

        User user = User.builder()

                .withName("Ivan")
                .withSurname("Ivanov")
                .withSurname("")
                .build();

        Singleton1.SINGLETON_1.method();

//        Shape shape = new Shape();
    }
}
