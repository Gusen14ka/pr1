package com.shapes;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        if (side < 0) throw new IllegalArgumentException("Side cant be negative");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString(){
        return "Square{" + "side=" + side + '}';
    }
}
