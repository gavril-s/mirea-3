package hw18;

import java.util.Arrays;

class MinMax<T> {
    private T[] array;
    public MinMax(T[] array) {
        this.array = array;
    }
    public T findMin() {
        Arrays.sort(array);
        return array[0];
    }
    public T findMax() {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}

class Calculator {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    public static <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
    public static <T extends Number> double subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        double result1 = Calculator.sum(3.14, 2.71);
        System.out.println("Sum: " + result1);

        double result2 = Calculator.multiply(2.5, 4);
        System.out.println("Multiply: " + result2);

        double result3 = Calculator.divide(10, 2);
        System.out.println("Divide: " + result3);

        double result4 = Calculator.subtraction(7, 3);
        System.out.println("Subtraction: " + result4);
    }
}
