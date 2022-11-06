import java.util.*;

class QuadraticEquationSolver {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value: ");
    double a = input.nextDouble();
    System.out.print("Enter b value: ");
    double b = input.nextDouble();
    System.out.print("Enter c value: ");
    double c = input.nextDouble();
    double sum1 = (b * -1);
    double sum2 = (Math.pow(b, 2) - (4 * a * c));
    double sum3 = (Math.sqrt(sum2));
    double sum4 = (sum1 + sum3);
    double sum5 = (sum1 - sum3);
    double sum6 = (sum4 / (2 * a));
    double sum7 = (sum5 / (2 * a));
    System.out.println("x = " + sum6);
    System.out.println("x = " + sum7);
    input.close();
  }
}