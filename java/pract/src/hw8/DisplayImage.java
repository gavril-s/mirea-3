package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DisplayImage {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File(imagePath));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
