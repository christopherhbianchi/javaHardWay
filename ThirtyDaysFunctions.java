import java.util.Scanner;
import static java.lang.System.*;

public class ThirtyDaysFunctions {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		out.print("Which month? (1-12) ");
		int month = kb.nextInt();
		
		out.println( monthDays(month) + " days hath " + monthName(month) );
		
	} 
	
	/* This returns the name for the given month, numbered (1 - 12)
	The parameter is the month number (1-12)
	It returns the English name of the month, or "error" if a number out of range is given
	*/
	
	public static String monthName(int month) {
	String monthName = "error";
	
	if (month == 1)
		monthName = "January";
	else if (month == 2)
		monthName = "February";
	else if (month == 3)
		monthName = "March";
	else if (month == 4)
		monthName = "April";
	else if (month == 5)
		monthName = "May";
	else if (month == 6)
		monthName = "June";
	else if (month == 7)
		monthName = "July";
	else if (month == 8)
		monthName = "August";
	else if (month == 9)
		monthName = "September";
	else if (month == 10)
		monthName = "October";
	else if (month == 11)
		monthName = "November";
	else if (month == 12)
		monthName = "December";
	
		return monthName;
	}
	
	
	/* This returns the number of days in a given month
	The parameter is the month number (1-12)
	It returns the numbers of days in the month, or 31 if it doesn't match any of those
	specific cases */
	
	public static int monthDays(int month) {
		int days;
		
		/* September, April, June, and November all have 30 days.
		February has 28 days.
		All the other days have 31. */
		
		switch(month)
		
		{
			case 9:
			case 4:
			case 6:
			case 11: days = 30;
				break;
			case 2: days = 28;
				break;
			default: days = 31;
		}
		
		return days;
	}
}	