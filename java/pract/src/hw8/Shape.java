package hw8;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    private Point position;
    private Color color;

    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Point getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "position=" + position +
                ", color=" + color +
                '}';
    }

    abstract void draw(Graphics g);
}
