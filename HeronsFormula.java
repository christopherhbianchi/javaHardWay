import static java.lang.System.*;

public class HeronsFormula {
	public static void main(String [] args) {
		double a, g;
		String tws = "A triangle with sides ";
		
		a = triangleArea(3, 3, 3);
		out.println("A triangle with sides 3,3,3 has area " + a );
		
		a = triangleArea(3, 4, 5);
		out.println("A triangle with sides 3,4,5 has area " + a );
		g = triangleArea(7, 8, 9);
		out.println(tws + "7,8,9 has area " + g );
		
		out.println( tws + "5,12,13 has area " + triangleArea(5, 12, 13) );	
		out.println( tws + "10,9,11 has area " + triangleArea(10, 9, 11) );
		out.println( tws + "8,15,17 has area " + triangleArea(8, 15, 17) );
		
		a = triangleArea(9, 9, 9);
		out.println("A triangle with sides 9,9,9 has area " + a);
	}
	
	
	//This function computes the area of a triangle with side lengths a, b, & c
	public static double triangleArea( int a, int b, int c ) {
		double s, A;
		
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		
		//After computing the area, you must "return" the computed value:
		return A;
	}
}
		