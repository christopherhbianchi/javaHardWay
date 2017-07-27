import static java.lang.System.*;
import java.util.Scanner;

public class YachtDice {
	public static void main(String[] args) {
		int r1, r2, r3, r4, r5;
		boolean allSame;
		
		do {
			r1 = 1 + (int)(Math.random()*6);
			r2 = 1 + (int)(Math.random()*6);
			r3 = 1 + (int)(Math.random()*6);
			r4 = 1 + (int)(Math.random()*6);
			r5 = 1 + (int)(Math.random()*6);
			out.println("\nYou rolled: " + r1 + " " + r2 + " " + 
			r3 + " " + r4 + " " + r5);
			showDice(r1);
			showDice(r2);
			showDice(r3);
			showDice(r4);
			showDice(r5);
			allSame = (r1 == r2 && r2 == r3 && r3 ==r4 && r4 == r5);
			
		} while ( ! allSame );
		out.println("The Yacht!!");
	}
	
	public static void showDice(int roll) {
		out.println("+---+");
		if (roll == 1) {
			out.println("|   |");
			out.println("| o |");
			out.println("|   |");
		}
		else if (roll == 2) {
			out.println("|o  |");
			out.println("|   |");
			out.println("|  o|");
		}
		else if (roll == 3) {
			out.println("|o  |");
			out.println("| o |");
			out.println("|  o|");
		}
		else if (roll == 4) {
			out.println("|o o|");
			out.println("|   |");
			out.println("|o o|");
		}
		else if (roll == 5) {
			out.println("|o o|");
			out.println("| o |");
			out.println("|o o|");
		}
		else if (roll == 6) {
			out.println("|o o|");
			out.println("|o o|");
			out.println("|o o|");
		}
		out.println("+---+");
	}
}