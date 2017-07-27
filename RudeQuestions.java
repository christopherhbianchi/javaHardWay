import java.util.Scanner;

public class RudeQuestions {

	public static void main (String[] args) {
		String name, day_of_the_week;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println ( weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.print ("Hopefully that is " + income + " per hour");
		System.out.println( " and not per year!");
		System.out.print ( "Well, thanks for answering my rude questions, " );
		System.out.println( name + ".");
		
		System.out.print ("What is your favorite day of the week " + name + "? ");
		day_of_the_week = keyboard.next();
		System.out.println("Perfect, " + day_of_the_week + " is my favorite day too!");
		
		}
	}
	
	/* Study Drills
	
	1. No the program doesn't blow up when you enter an integer value when it's expecting
	a double because an integer is the same as a double just it has no fractional portion
	to it.
	
	2. No the program doesn't blow up when you type a numeric value when it's expecting a
	String because a String can store any type of value. The problem is that you won't be
	able to do calculations with that number if it's stored as a String.
	
	3. Each one of them blew up if you input a value that was a different data type than
	the program was expecting. Except String was the only one that wouldn't blow up.
	
	4. I added the day_of_the_week String varibale. I use it at the end.
	
	*/