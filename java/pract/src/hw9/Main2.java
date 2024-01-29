package hw9;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Car2 implements Priceable {
    private String make;
    private String model;
    private double price;

    public Car2(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class RealEstate implements Priceable {
    private String location;
    private double price;

    public RealEstate(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Priceable product = new Product("PC", 1000.0);
        Priceable car = new Car2("Tesla", "ModelS", 100000.0);
        Priceable realEstate = new RealEstate("Moscow", 500000.0);

        System.out.println("Цена продукта " + ((Product) product).getName() + ": $" + product.getPrice());
        System.out.println(
                "Цена автомобиля " + ((Car2) car).getMake() + " " + ((Car2) car).getModel() + ": $" + car.getPrice());
        System.out.println(
                "Цена недвижимости в " + ((RealEstate) realEstate).getLocation() + ": $" + realEstate.getPrice());
    }
}
