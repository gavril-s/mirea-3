package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Animation {
    private JFrame frame;
    private JPanel animationPanel;
    private BufferedImage[] frames;
    private int currentFrameIndex;
    private Timer timer;

    public Animation(String imagePath, int frameCount, int frameDelay) {
        frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (frames != null && frames.length > 0) {
                    g.drawImage(frames[currentFrameIndex], 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        loadFrames(imagePath, frameCount);

        timer = new Timer(frameDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextFrame();
            }
        });

        frame.add(animationPanel);
        frame.setVisible(true);
    }

    private void loadFrames(String imagePath, int frameCount) {
        try {
            BufferedImage animationImage = ImageIO.read(new File(imagePath));

            int frameWidth = animationImage.getWidth() / frameCount;
            int frameHeight = animationImage.getHeight();
            frames = new BufferedImage[frameCount];

            for (int i = 0; i < frameCount; i++) {
                frames[i] = animationImage.getSubimage(i * frameWidth, 0, frameWidth, frameHeight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void nextFrame() {
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        animationPanel.repaint();
    }

    public void startAnimation() {
        timer.start();
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Пожалуйста, укажите путь к изображению, количество кадров и задержку между кадрами.");
            return;
        }

        String imagePath = args[0];
        int frameCount = Integer.parseInt(args[1]);
        int frameDelay = Integer.parseInt(args[2]);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Animation animation = new Animation(imagePath, frameCount, frameDelay);
                animation.startAnimation();
            }
        });
    }
}
