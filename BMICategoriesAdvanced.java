import java.util.Scanner;

public class BMICategoriesAdvanced {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, inches_conv, pounds_conv, bmi;
		
		
		System.out.print ("Enter your height in inches: ");
		inches = keyboard.nextDouble();
		
		System.out.print ( "Enter your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		inches_conv = 0.025 * inches;
		pounds_conv = 0.45 * pounds;
		
		bmi = pounds_conv / (inches_conv * inches_conv);
		
		System.out.println("Your BMI is: " + bmi + ", And your BMI Category is... ");		
				
		System.out.print( "BMI category: ");
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
			}
			
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
			}
		
		else if ( bmi < 18.5 ) { 
			System.out.println( "underweight" );
			}
			
		else if (bmi < 25.0 ) {
			System.out.println( "normal weight" );
			}
			
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
			}
			
		else if ( bmi < 35.0 )	{
			System.out.println( "moderately obese" );
			}
			
		else if ( bmi < 40.0 ) {
			System.out.println ( "severely obese" );
			}
			
		else {
			System.out.println( "very severely \"morbidly\" obese" );
			}
			
			}
		}
		