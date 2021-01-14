package com.area;

import java.util.Scanner;

public class CircleArea {
    static final double PI = 22/7.0;

    public static void main(String[] args) {
        // Declaring and initializing scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome user to the application that will calculate the area of a circle.");

        // Retrieving value of radius
        System.out.println("Please enter the Radius of the circle.");
        final double radiusOfCircle = scanner.nextFloat();

        // Calculating area of circle
        System.out.println("Calculating area using formula: PI * r ^ 2");
        final double areaOfCircle = PI * (Math.pow(radiusOfCircle, 2));

        // Output
        System.out.println("Radius: " + radiusOfCircle);
        System.out.println("Calculated area: " + areaOfCircle);
    }
}
