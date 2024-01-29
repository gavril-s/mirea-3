package hw9;

interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getName() {
        return modelName;
    }
}

class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}

public class Main {
    public static void main(String[] args) {
        Nameable earth = new Planet("Venus");
        Nameable toyotaCamry = new Car("Tesla ModelS");
        Nameable lion = new Animal("Dog");

        System.out.println("Планета: " + earth.getName());
        System.out.println("Машина: " + toyotaCamry.getName());
        System.out.println("Животное: " + lion.getName());
    }
}
