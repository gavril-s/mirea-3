package hw3;

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("Testing class Circle...");
        System.out.println("Creating object...");
        Circle circle = new Circle("red", true, 10);
        System.out.println(circle);
        System.out.println("Changing fields...");
        circle.setColor("blue");
        circle.setFilled(false);
        circle.setRadius(5);
        System.out.println(circle);
        System.out.println("Getting area and perimeter...");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Testing class Rectangle...");
        System.out.println("Creating object...");
        Rectangle rectangle = new Rectangle(3, 4, "black", false);
        System.out.println(rectangle);
        System.out.println("Changing fields...");
        rectangle.setColor("red");
        rectangle.setFilled(true);
        rectangle.setWidth(5);
        rectangle.setLength(7);
        System.out.println(rectangle);
        System.out.println("Getting area and perimeter...");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Testing class Square...");
        System.out.println("Creating object...");
        Square square = new Square(6, "white", true);
        System.out.println(square);
        System.out.println("Changing fields...");
        square.setColor("green");
        square.setFilled(true);
        square.setSide(12);
        System.out.println(square);
        System.out.println("Getting area and perimeter...");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Passed all tests.");
    }
}
