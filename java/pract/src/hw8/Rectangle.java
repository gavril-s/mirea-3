package hw8;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Point position, Color color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getPosition().getX(), getPosition().getY(), width, height);
    }
}
