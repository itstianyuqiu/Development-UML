package ictgradschool.industry.lab_uml.ex06;

/**
 * Created by anhyd on 13/03/2017.
 */
public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract int getNumSides();

    public boolean hasSmallerAreaThan(Shape other) {

        return this.getArea() < other.getArea();

    }

}
