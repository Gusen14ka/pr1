
public class Main {

    public static void printArea(Shape shape) {
        System.out.printf("%s -> square = %.4f%n", shape.toString(), shape.getArea());
    }


    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape s = new Square(7);

        printArea(r);
        printArea(s);
    }
}
