package Module3;

import java.util.*;

public class StringFun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = s.nextLine();
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.print("Enter a character: ");
        char character = s.next().charAt(0);
        int l1 = string.indexOf(character);
        int l2 = string.lastIndexOf(character);
        System.out.println("first location: " + l1);
        System.out.println("last location: " + l2);
        System.out.println("String between: " + string.substring((l1), l2));
        System.out.println("String change: " + string.replace(" ", "$"));
        s.close();
    }  
}