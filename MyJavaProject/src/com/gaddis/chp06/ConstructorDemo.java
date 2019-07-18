package com.gaddis.chp06;

/**
 * This program demonstrates the Rectangle class's constructor.
 */
public class ConstructorDemo {

    public static void main(String[] args) {
        // Create a Rectangle object, passing 5.0 and
        // 15.0 as arguments to the constructor.
        Rectangle box = new Rectangle(5.0, 15.0);

        // Display the length.
        System.out.println("The box's length is "
                + box.getLength());

        // Display the width.
        System.out.println("The box's width is "
                + box.getWidth());

        // Display the area.
        System.out.println("The box's area is "
                + box.getArea());

        //added rl3457 Create another Rectangle object using the default constructor
        Rectangle box2 = new Rectangle();

        // Display the Constructor's default values
        System.out.println("The box2's width is "
                + box2.getWidth());

        // Display the area.
        System.out.println("The box2's area is "
                + box2.getArea());

        //Set the values
        box2.setLength(5.0);
        box2.setWidth(9.0);

        // Display the area for box2
        System.out.println("\n The box2's area is "
                + box2.getArea());

        Rectangle box3 = new Rectangle("2.3", "5.6");

        // Display the length.
        System.out.println("The box3's length is "
                + box3.getLength());

        // Display the Constructor's default values
        System.out.println("The box3's width is "
                + box3.getWidth());

        // Display the area.
        System.out.println("The box3's area is "
                + box3.getArea());




    }
}
