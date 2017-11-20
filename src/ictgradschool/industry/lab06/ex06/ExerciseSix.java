package ictgradschool.industry.lab06.ex06;

import java.text.DecimalFormat;

/**
 * Main program for Exercise Six.
 *
 * Creates some shapes and prints out their properties.
 */
public class ExerciseSix {

    private void start() {

        Circle circle = new Circle(6);
        RegularPolygon hexagon = new RegularPolygon(6, 7);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("The circle's radius is: " + format2DecimalPlaces(circle.getRadius()));
        System.out.println("The circle's area is: " + format2DecimalPlaces(circle.getArea()));
        System.out.println("The circle's circumference is: " + format2DecimalPlaces(circle.getPerimeter()));

        System.out.println("The hexagon has " + hexagon.getNumSides() + " sides, each of length " + hexagon.getSideLength());
        System.out.println("The hexagon's perimeter is: " + format2DecimalPlaces(hexagon.getPerimeter()));
        System.out.println("The hexagon's area is: " + format2DecimalPlaces(hexagon.getArea()));

        System.out.println("The rectangle's length is " + rectangle.getLength() + ", and its width is " + rectangle.getWidth());
        System.out.println("The rectangle's perimeter is: " + rectangle.getPerimeter());
        System.out.println("The rectangle's area is: " + rectangle.getArea());

        // TODO Draw a sequence diagram showing what happens when the following code is invoked, given the
        // TODO variable declarations above.
        // HINT: There should be several objects represented in your sequence diagram, including:
        // - ExerciseSix (this), circle, hexagon, and System.out
        // ***************************************
        boolean circleIsSmaller = circle.hasSmallerAreaThan(hexagon);
        if (circleIsSmaller) {
            System.out.println("The hexagon is bigger than the circle");
        } else {
            System.out.println("The circle is bigger than the hexagon");
        }
        // ***************************************
    }

    private String format2DecimalPlaces(double number) {
        DecimalFormat format = new DecimalFormat("#.##");
        return format.format(number);
    }

    public static void main(String[] args) {

        ExerciseSix ex = new ExerciseSix();
        ex.start();

    }
}
