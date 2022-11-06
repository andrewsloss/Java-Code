/* 
 * Question -
 * Loop through numbers in an array.
 * Print sum of all numbers in array.
 */

public class AddNumbersInArray {
	public static void main(String[] args) {
		int n = 0;
		int[] arr = {5, 3, 2, 1, 7};
		for(int i = 0; i < arr.length; i ++) {
			n += arr[i];
		}
		
		System.out.println(n);
	}
}