package hw8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(getWidth());
                    int y = random.nextInt(getHeight());
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                    int shapeType = random.nextInt(2); // 0 - Circle, 1 - Rectangle
                    if (shapeType == 0) {
                        int radius = random.nextInt(50) + 20;
                        Circle circle = new Circle(new Point(x, y), color, radius);
                        circle.draw(g);
                    } else {
                        int width = random.nextInt(100) + 20;
                        int height = random.nextInt(100) + 20;
                        Rectangle rectangle = new Rectangle(new Point(x, y), color, width, height);
                        rectangle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
