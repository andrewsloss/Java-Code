package Module3;

import java.util.*;

public class NameChanger {
    public static void main(String[] args) {
        System.out.println("------Name Changer Program------");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = a.nextLine();
        String arr [] = name.split(" ");
        int length = arr.length;
        System.out.println("Your name will be listed as:  " + arr[length-1] + ", " + name.charAt(0) + ".");
        a.close();
    }
}