import java.util.Scanner;

public class ForgetfulMachine {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println ( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		
		System.out.println ( "Enter a number between 0.0 and 1.0" );
		keyboard.nextDouble();
		
		System.out.println ( "Is there anything else you would like to say?" );
		keyboard.next();
		
		}
	}
	
// The 2nd question blows up when I type "Indiana"
/* The 3rd question blows up when I type "Basketball". It blows up like this because
"Basketball" is not a floating point value and the Scanner object then cannot package
it as a floating-point value. */
	