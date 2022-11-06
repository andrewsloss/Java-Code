package Module4;

import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("---Rock Paper Scissors---");
		System.out.println("\n---Menu--");
		System.out.println("\n1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter selection: ");
		int choice = scanner.nextInt();
		Random random = new Random();
		int random_num = random.nextInt(3) + 1;
		
		// 1 = rock
		// 2 = paper
		// 3 = scissors
		
		String playerChoice = whatYouPicked(choice);
		String computerChoice = whatComputerPicked(random_num);
		
		System.out.println("\nYou picked: " + playerChoice);
		System.out.println("Computer picked: " + computerChoice + "\n");
		
		if (choice == random_num) {
			System.out.println("You Tied");
		}
		else if (choice == 1 && random_num == 2) {
			System.out.println("You Lost");
		}
		else if (choice == 1 && random_num == 3) {
			System.out.println("You Won");
		}
		else if (choice == 2 && random_num == 1) {
			System.out.println("You Won");
		}
		else if (choice == 2 && random_num == 3) {
			System.out.println("You Lost");
		}
		else if (choice == 3 && random_num == 1) {
			System.out.println("You Lost");
		}
		else if (choice == 3 && random_num == 2) {
			System.out.println("You Won");
		}
		
		scanner.close();
	}
	
	public static String whatYouPicked(int choice) {
		String player = "";
		if (choice == 1) {
			player = "Rock";
		}
		else if (choice == 2) {
			player = "Paper";
		}
		else if (choice == 3) {
			player = "Scissors";
		}
		return player;
	}
	public static String whatComputerPicked(int random_num) {
		String computer = "";
		if (random_num == 1) {
			computer = "Rock";
		}
		else if (random_num == 2) {
			computer = "Paper";
		}
		else if (random_num == 3) {
			computer = "Scissors";
		}
		return computer;
	}
}