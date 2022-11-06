package Module3;

import java.util.*;

public class CylinderProperties {
    public static void main(String[] args) {
        System.out.println("---Cylinder---\n");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the radius of your cylinder:");
        double radius = a.nextDouble();
        System.out.println("Enter the height of your cylinder:");
        double height = a.nextDouble();
        System.out.println("\nCylinder Properties:");
        System.out.printf("Raduis:             " + "%.3f", radius);
        System.out.printf("Height:             " + "%.3f", height);
        surfaceArea(radius, height);
        volume(radius, height);
        a.close();
    }

    public static void volume(double radius, double height) {
        //   π * r^2 * H
        double volume = ((Math.PI * (radius * radius)) * height);
        System.out.printf("Volume:           " + "%.3f", volume);
    }

    public static void surfaceArea(double radius, double height) {
        //   2 * π * r^2 + 2 * π * r * h
        double surfaceArea = (((radius * radius) * Math.PI * 2) + 2 * Math.PI * radius * height);
        System.out.printf("Surface Area:     " + "%.3f", surfaceArea);
    }
}