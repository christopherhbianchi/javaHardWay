import java.util.Scanner;
import static java.lang.System.*;

public class EnterPin {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin,entry;
		String password, passwordEntry;
		
		password = "maverick";
		pin = 12345;
		
		out.println("WELCOME TO THE BANK OF JAVA.");
		out.println("ENTER YOUR PASSWORD: ");
		passwordEntry = keyboard.next();
		
		while ( passwordEntry.compareTo(password) != 0 ) {
			out.println("THAT IS AN INVALID PASSWORD.");
			out.println("ENTER YOUR PASSWORD: ");
			passwordEntry = keyboard.next();
		}			
		out.println("ACCESS GRANTED.");
			
		
		/* the section for entering the PIN */
		
		out.println("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while ( entry != pin ) {
			out.println("\nINCORRECT PIN. TRY AGAIN.");
			out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
		/*
		we could always replace that static number with a variable later
		we can also put in prompts to take the user's name and say "hello mr. bianchi
		*/		
		}
	}