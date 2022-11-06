import java.util.*;

public class BasicGame {
    public static void main(String[] args) {

        Random random = new Random();
        int random_num = random.nextInt(100);

        int num_guesses = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Enter a number between 0 and 100: ");
            int guess = scanner.nextInt();

            num_guesses += 1;

            if (guess == random_num) {
                System.out.println("Good job the number was " + (random_num) + "!");
                break;
            }
            else if (guess > random_num) {
                System.out.println("Guess Lower!");
            }
            else if (guess < random_num) {
                System.out.println("Guess Higher!");
            }
        }

        System.out.println("It took you " + (num_guesses) + " guesses!");

        scanner.close();

    }
}