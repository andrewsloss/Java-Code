package Module3;

import java.util.*;

class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        System.out.println("---Distance Between Two Points---");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the x value of your first point (Whole Number):");
        double x1 = s.nextInt();
        System.out.print("Enter the y value of your first point (Whole Number):");
        double y1 = s.nextInt();
        System.out.print("Enter the x value of your second point (Whole Number):");
        double x2 = s.nextInt();
        System.out.print("Enter the y value of your second point (Whole Number):");
        double y2 = s.nextInt();
        double sum1 = (Math.pow((x2 - x1),2));
        double sum2 = (Math.pow((y2 - y1),2));
        double sum3 = (sum1 + sum2);
        double distance = (Math.sqrt(sum3));
        System.out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f.", x1, y1, x2, y2, distance);
        s.close();
    }
}