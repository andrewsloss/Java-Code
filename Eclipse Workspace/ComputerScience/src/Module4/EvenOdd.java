package Module4;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("---Even Odd---\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int num = s.nextInt(); 
        s.close();

        if (num % 2 == 1) {
                System.out.println(num + " is odd!");
        } 
        
        else {
            System.out.println(num + " is even!");
        }
    }
}