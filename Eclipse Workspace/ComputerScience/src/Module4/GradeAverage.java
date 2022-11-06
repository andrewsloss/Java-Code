package Module4;

import java.util.*;

public class GradeAverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Grade Average Program---");
        System.out.print("\nEnter grade one: ");
        double Gone = sc.nextInt();
        System.out.print("Enter grade two: ");
        double Gtwo = sc.nextInt();
        System.out.print("Enter grade three: ");
        double Gthree = sc.nextInt();
        System.out.print("Enter grade four: ");
        double Gfour = sc.nextInt();
 
        System.out.printf("Your average is %.2f.",average(Gone, Gtwo, Gthree, Gfour));
        System.out.println("\nYou have a(n) " + gradeLetter(average(Gone, Gtwo, Gthree, Gfour)) + ".");
        sc.close();
        
    }
    public static char gradeLetter(double average){
        if (average>=90){
            return 'A';
        } else if (average>=80){
            return 'B';
        } else if (average>=75){
            return 'C';
        } else if (average>=70){
            return 'D';
        } else {
            return 'F';
        }
    }
    public static char gradeLetter(double g1, double g2, double g3, double g4){
        return gradeLetter((g1+g2+g3+g4)/4);
    }
    public static double average(double g1, double g2, double g3, double g4){
        return (g1+g2+g3+g4)/4;
    }
}