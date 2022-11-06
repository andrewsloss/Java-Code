package Module4;

import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("---Temperature Conversion Menu---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenhiet");
        System.out.println("2. Fahrenhiet to Celsius");
        System.out.print("\nEnter selection: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            celToFah();
        }
        else if (choice == 2) {
            fahToCel();
        }
        
        scanner.close();
    }

    public static double fahToCel() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("\nEnter your temperature in Fahrenhiet: ");
        double fah = s1.nextDouble();
        double sum2 = (fah - 32);
        double celCon = (sum2 * 5/9);
        System.out.println("\n" + fah + " degrees in Fahrenhiet is " + celCon + " degrees in Celsuis.");
        return celCon;
    }

    public static double celToFah() {
        Scanner s2 = new Scanner(System.in);
        System.out.print("\nEnter your temperature in Celsius: ");
        double cel = s2.nextDouble();
        double sum1 = (cel * 9/5);
        double fahCon = (sum1 + 32);
        System.out.println("\n" + cel + " degrees in Celsius is " + fahCon + " degrees in Fahrenhiet.");
        return fahCon;
    }
    
    //s1.close();
    //s2.close();
}