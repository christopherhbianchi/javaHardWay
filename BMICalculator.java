import java.util.Scanner;

public class BMICalculator {

	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		double inches, pounds, bmi, m, kg, metric_bmi;
		
		System.out.print("Your height in inches: ");
		inches = keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		bmi = pounds / (inches * inches);
		
		m = (1/39.3701) * inches;
		kg = 0.453592 * pounds;
		metric_bmi = m * kg;
		
		System.out.println( "Your BMI by the Imperial System is " + bmi);
		System.out.println( "Your BMI by the Metric System is " + metric_bmi);
		
		}
	}