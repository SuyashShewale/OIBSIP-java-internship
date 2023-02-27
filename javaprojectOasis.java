import java.util.Scanner;
import java.util.Random;
public class Main {
 
	// Global Variables
	static Scanner n = new Scanner(System.in);
	static int guess = 0, counter = 0;
	static int number = numberGenerator();
 
	// numberGenerator: Generates a Random Number
	public static int numberGenerator() {
		Random gen = new Random();
		int number = gen.nextInt(100)+1;
		return number;
	}
 
	// displayTitle: Displays the Title of the Program
	public static void displayTitle() {
		System.out.println("=====================================");
		System.out.println("| NUMBER GUESSING GAME 2.0 |");
		System.out.println("=====================================");
		System.out.println("");
	}
 
	// ratePlayer: Rates the player based on Score
	public static void ratePlayer() {
		if (counter == 0)
			System.out.println("ERROR: This is Impossible!");
		else if (counter == 1)
			System.out.println("You are a hacker!");
		else if (counter == 2)
			System.out.println("You should try the Lottery!");
		else if (counter == 3)
			System.out.println("You should try the Lottery.");
		else if (counter == 4)
			System.out.println("You've got great guessing skills!");
		else if (counter == 5)
			System.out.println("Your guessing skills are above par!");
		else if (counter == 6)
			System.out.println("Not bad guessing skills.");
		else if (counter == 7)
		            System.out.println("You're about average.");
		else if (counter == 8)
	                        System.out.println("You're as good as a computer can get.");
		            else if (counter == 9)
System.out.println("You're below average...");
		else if (counter == 10)
			System.out.println("I mean not terrible.... but....");
		else if (counter == 11)
			System.out.println("You're not the best guesser.");
		else
			System.out.println("SORRY!This game is not your cup of tea.");
	}
 
	// singlePlayer: Single Player Gamemode for Guess My Number!
	public static void singlePlayer() {  
	    System.out.println("Single Player mode Selected."); 
	    System.out.println("");
	    displayTitle();
	    while (guess!=number) {
	    	System.out.println("===========================");
	    	System.out.print("Please guess a Number: ");
	    	guess = n.nextInt();
	    	System.out.println("===========================");
	    	counter++;
	    	if (number < guess)
	    		System.out.println("Your guess is Too High!");
	    	else if (number > guess)
	    		System.out.println("Your guess is Too Low!");
	    	System.out.println("");
	    }
	System.out.println("========================================");
	    System.out.println("| Congrats! You've guessed the Number! |");
 
System.out.println("========================================");
	    System.out.println("The Number was: "+ guess);
	    System.out.println("It took you "+counter+ " tries!");
	    ratePlayer();  
	}
	// multiPlayer: Multiple Player Gamemode for Guess My Number!
	public static void multiPlayer() {
		System.out.println("Multiplayer mode Selected."); 
		System.out.println("");
		displayTitle();
		int guess1 = 0, guess2 = 0;
		String winner = null;
		while (guess1!=number && guess2!=number) {
			System.out.println("================================");
			System.out.println("Player 1: Guess a Number: ");
			guess1 = n.nextInt();
			System.out.println("================================");
System.out.println("Player 2: Guess a Number: ");
			guess2 = n.nextInt();
			System.out.println("================================");
			System.out.println("Player 1 Guessed "+ guess1); 
			System.out.println("Player 2 Guessed "+ guess2); 
			counter++;
			if (number < guess1)
				System.out.println("Player 1: Your guess is Too High!");
			else if (number > guess1)
				System.out.println("Player 1: Your guess is Too Low!");
			if (number < guess2)
				System.out.println("Player 2: Your guess is Too High!");
			else if (number > guess2)
				System.out.println("Player 2: Your guess is Too Low!");
			System.out.println("");
		}
		if (guess1==number) {
			System.out.println("============================");
			System.out.println("| Congrats! Player 1 Wins! |");
			System.out.println("============================");
			winner = "Player 1";
		}
		else if (guess2==number) {
		System.out.println("============================");
			System.out.println("| Congrats! Player 2 Wins! |");
		System.out.println("============================");
			winner = "Player 2";
		}
		else if (guess1==number && guess2==number) {
			System.out.println("=========================");
			System.out.println("| Congrats? It's a TIE! |");
			System.out.println("=========================");
			winner = "Both Players";
		}
		System.out.println("The Number was: "+ number);
		System.out.println("It took "+ winner+ ": "+ counter+ " tries!");
		System.out.println("");
		System.out.println("A rating for "+ winner+ ":");
		ratePlayer();
		System.out.println("");
		if (guess1!=guess2) {
		System.out.println("A rating for the loser:");
		System.out.println("Guess Harder!");
		}
	}
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		displayTitle();
		System.out.println("Will this be Singleplayer or Multiplayer?");
		System.out.print("Type 'S' for Singleplayer or 'M' for Multiplayer: ");
		char option = s.next().charAt(0);
		if (option == 'S'|| option=='s')
			singlePlayer();
		else if (option == 'M'|| option=='m')
			multiPlayer();
		else
			System.out.println("ERROR: Invalid Option!");
	}
}
