package Module2;

import java.util.*;

public class MileHighSodaCans {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of gallons made:");
        double gallons = a.nextDouble();
        double oz = (gallons * 128);
        double cans = (oz / 12);
        System.out.println("\nThe number of cans in the stack is: " + (long)cans);
        double height = ((long)cans * 4.75);
        System.out.println("The height of the stack in inches is: " + (long)height);
        double feet = (height / 12);
        double miles = (feet / 5280);
        System.out.println("The height of the stack in miles is: " + (long)miles);
        double moon2 = (miles / 239000);
        System.out.println("The number of times the stack would reach the moon is: " + (Math.floor(moon2)));
        a.close();
    }
}