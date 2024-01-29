package hw2;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("Testing class Ball...");
        System.out.println("Creating object...");
        Ball ball = new Ball(2.3, 1.1);
        System.out.println(ball);

        System.out.println("Setting X...");
        ball.setX(1);
        System.out.println(ball);

        System.out.println("Setting Y...");
        ball.setY(1);
        System.out.println(ball);

        System.out.println("Setting X and Y...");
        ball.setXY(2, 2);
        System.out.println(ball);

        System.out.println("Moving ball...");
        ball.setXY(-1, 1);
        System.out.println(ball);

        System.out.println("Finished.");
    }
}
