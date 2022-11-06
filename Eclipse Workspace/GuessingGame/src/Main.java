import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchElementException, IndexOutOfBoundsException {

        Random random = new Random();
        int random_num = random.nextInt(100);

        //System.out.println(random_num);

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

        //---------------------------------------------------------------------

        File file = new File("data.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(num_guesses);

        pw.close();

        //---------------------------------------------------------------------

        Scanner s = new Scanner(file);
        ArrayList<Integer> listInt = new ArrayList<Integer>();

        while (s.hasNextLine())
            listInt.add(s.nextInt());

        Collections.sort(listInt);

        s.close();

        //---------------------------------------------------------------------

        FileWriter fw2 = new FileWriter(file, true);
        PrintWriter pw2 = new PrintWriter(fw2);

        pw2.print("\n");

        pw2.close();

        //---------------------------------------------------------------------

        System.out.print("High Score = ");
        System.out.println(listInt.get(0));

    }
}