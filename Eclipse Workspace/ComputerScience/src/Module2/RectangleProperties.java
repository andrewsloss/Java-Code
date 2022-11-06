package Module2;

import java.util.*;

class RectangleProperties {
    public static void main(String[] args) throws NoSuchElementException {
        System.out.println("---Rectangle Program---");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the length (whole number): ");
        int int1 = a.nextInt();
        System.out.print("Enter the width (whole number): ");
        int int2 = a.nextInt();
        int perimeter = ((2 * int1) + (2 * int2));
        int area = (int1 * int2);
        System.out.println("Rectangle properties:");
        System.out.println("Length    - " + int1);
        System.out.println("Width     - " + int2);
        System.out.println("Perimeter - " + perimeter);
        System.out.println("Area      - " + area);
        a.close();
    }
}