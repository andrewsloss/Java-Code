package Module2;

import java.util.*;

class MixedNumber {
    public static void main(String[] args) {
        System.out.println("---Mixed Number Version 1---");

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a numberator: ");
        int n = a.nextInt();
        System.out.print("Enter a denominateor: ");
        int d = a.nextInt();

        System.out.print("\nThe mixed number derived from the fraction " + n + "/" + d + " is ");

        int count = 0;

        while (n > d) {
            n -= d;
            count += 1;
        }

        if (n < d) {
            System.out.println(count + " " + n + "/" + d + ".");
        }

        else if(n == d) {
            count += 1;
            System.out.println(count + ".");
        }

        a.close();

    }
}