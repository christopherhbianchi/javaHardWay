import java.util.Scanner;
import static java.lang.System.*;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready, answer = "YES!";
		
		out.print("This is the Safe Square Root program! Are you ready?!?"
		+ " Say \"YES!\" ");
		ready = keyboard.next();
		
		while (! ready.equals(answer)) {
			out.print("That's not the right answer!\nARE YOU READY?!? ");
			ready = keyboard.next();
		}
		
		out.print("Give me a number, and I'll find it's square root. ");
		out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		
		while (x < 0) {
			out.print("I won't take the square root of a negative.");
			out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		out.println("The square root of " + x + " is " + y);
	}
}	