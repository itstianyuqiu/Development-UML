package ictgradschool.industry.lab_uml.ex06;

/**
 * Represents a circle.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public int getNumSides() {
        return 1;
    }
}
