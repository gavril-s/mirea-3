package hw8;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Point position, Color color, int radius) {
        super(position, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(
                getPosition().getX() - radius,
                getPosition().getY() - radius,
                2 * radius, 2 * radius
        );
    }
}
