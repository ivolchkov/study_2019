package ua.mycompany.immutable;

public class A {
    private int age;

    public A(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}
