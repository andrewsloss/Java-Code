package Module2;

import java.util.*;

public class FinalCalculator {
    public static void main(String[] args) {
        System.out.println("---Final Calculator---");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the grade you got for the first six weeks: ");
        double term1 = a.nextDouble();
        System.out.print("Enter the grade you got for the second six weeks: ");
        double term2 = a.nextDouble();
        System.out.print("Enter the grade you got for the third six weeks: ");
        double term3 = a.nextDouble();
        System.out.print("Enter the average you want for the semester: ");
        double semester = a.nextDouble();
        double sum1 = (term1 + term2 + term3);
        double sum2 = (sum1 / 3);
        double sum3 = (sum2 * 0.85);
        double sum4 = (semester - sum3);
        double sum5 = (sum4 / 0.15);
        System.out.printf("\nYou would need to get a %.2f on your final to have a %.2f for the semester.\n",sum5, semester);
        a.close();
    }
}