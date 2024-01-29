package hw3;

public class WrongCode {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // s1 - объект класса Shape и компилятор не может быть уверен что у него есть метод getRadius
        //System.out.println(s1.getRadius());

        // В этом блоке всё хорошо
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape - абстрактный класс, поэтому нельзя создать экземпляр класса Shape
        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // s3 - объект класса Shape и компилятор не может быть уверен что у него есть метод getLength
        //System.out.println(s3.getLength());

        // В этом блоке всё хорошо
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // s4 - объект класса Shape и компилятор не может быть уверен что у него есть метод getSide
        //System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // r2 - объект класса Rectangle и компилятор не может быть уверен что у него есть метод getSide
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        // В этом блоке всё хорошо
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
