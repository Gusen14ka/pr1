public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) throw new IllegalArgumentException("Sides cant be negative");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
