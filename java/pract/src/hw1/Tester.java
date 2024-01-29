package hw1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Testing class \"Dog\"...");
        System.out.println("Creating object...");
        Dog dog = new Dog("Dog", 10);
        System.out.println(dog);
        System.out.println("Changing fields...");
        dog.setAge(5);
        dog.setName("Dog2");
        System.out.println(dog);
        System.out.println("Testing translation to human age...");
        System.out.println("Age in human years: " + dog.ageInHumanYears());
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Testing class \"Ball\"...");
        System.out.println("Creating object...");
        Ball ball = new Ball(9.9f, 5, "blue");
        System.out.println(ball);
        System.out.println("Changing fields...");
        ball.setPrice(10);
        ball.setRadius(3);
        ball.setColor("red");
        System.out.println(ball);
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Testing class \"Book\"...");
        System.out.println("Creating object...");
        Book book = new Book(100, 555, "Tolstoi");
        System.out.println(book);
        System.out.println("Changing fields...");
        book.setPrice(200);
        book.setNumberOfPages(1012);
        book.setAuthor("Erofeev");
        System.out.println(book);
        System.out.println("Finished.");
        System.out.println();

        System.out.println("Passed all tests.");
    }
}
