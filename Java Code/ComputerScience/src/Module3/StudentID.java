package Module3;

import java.util.*;

public class StudentID {

    public static void main(String[] args) {
        System.out.println("---Student ID---");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String f = s.nextLine();
        System.out.print("Enter your last name: ");
        String l = s.nextLine();
        System.out.print("Enter your grade level: ");
        int g = s.nextInt();
        System.out.print("Enter your id: ");
        long id = s.nextLong();
        System.out.println("\nThe text for your student ID is: ");
        studentID(f, l, g, id);
        s.close();
    }

    public static void studentID(String f, String l, int g, long id) {
        System.out.println("Name: " + l + ", " + f);
        System.out.println("Grade: " + g);
        System.out.println("ID: " + id);
    }
}