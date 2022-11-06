import java.util.*;

/* 
 * Question -
 * Take in a number.
 * If number is divisible by 3 print fizz.
 * If number is divisible by 5 print buzz.
 * If number is divisible by 3 and 5 print fizz buzz.
 */

public class CheckDivisibleThreeFive {
	public static void main(String[] args) {
		//String checkDivisible = checkOneNum();
		//System.out.println(checkDivisible);
		checkAll();
	}

	public static String checkOneNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		int num = scanner.nextInt();
		
		int x = (num % 3);
		int y = (num % 5);
		
		if (x == 0 && y == 0) {
			return "fizz buzz";
		}
		else if (x == 0) {
			return "fizz";
		}
		else if (y == 0) {
			return "buzz";
		}
		else {
			return "nope";
		}
	}
	
	public static void checkAll() {
		for (int i = 1; i < 100; i ++) {
			int x = (i % 3);
			int y = (i % 5);
			
			if (x == 0 && y == 0) {
				System.out.println("fizz buzz");
			}
			else if (x == 0) {
				System.out.println("fizz");
			}
			else if (y == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}