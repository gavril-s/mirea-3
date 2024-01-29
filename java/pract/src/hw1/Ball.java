package hw1;

public class Ball {
    private float price;
    private int radius;
    private String color;

    public Ball(float price, int radius, String color) {
        this.price = price;
        this.radius = radius;
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + price +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
