import java.util.Scanner;
import static java.lang.System.*;

public class HighLow {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(100 * Math.random() );
		
		out.println("I'm thinking of a number between 1-100.");
		out.println("Try to guess it!");
		out.print ("> ");
		guess = keyboard.nextInt();
		
		while (secret != guess ) {
			if (guess < secret) {
				out.print("Sorry, your guess is too low.");
				out.print("Try again. \n> ");
				guess = keyboard.nextInt();
			}
			if (guess > secret) {
				out.print("Sorry, your guess is too high.");
				out.print("Try again. \n> ");
				guess = keyboard.nextInt();
			}
		}
		
		out.println("You guessed it! What are the odds?!?" );
	}
}