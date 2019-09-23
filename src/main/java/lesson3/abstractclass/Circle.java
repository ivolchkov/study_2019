package lesson3.abstractclass;

public class Circle extends Shape {

    private int radius;

    public Circle(String name, int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    public void printName(String name) {
        System.out.println(name);
    }
}
