package hussain;

/*Quadratic Program
 * Inputs 3 numbers and outputs information using the quadratic formula calculating the number of roots
 * Jared Hussain
 * March 21, 2016
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {
	
	
	
	public static void main(String[] arges) {	
		// introduce variables
		double a;
		double b;
		double c;
		double answer;
		double answer2;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		// collect information
		System.out.println("what number should be A?");
		a = Double.parseDouble(scan.nextLine());
		System.out.println("what number should be B?");
		b = Double.parseDouble(scan.nextLine());
		System.out.println("what number should be C?");
		c = Double.parseDouble(scan.nextLine());
		
		answer = ( b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2 * a);
		answer2 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2 * a);
		
		// display output
		if (Math.pow(b, 2) - 4 * a *c<0)
		{
			System.out.println("No Roots");
		}
		else if (Math.pow(b, 2) - 4 * a *c==0)
		{
			System.out.println("One Root, which is" + df.format(answer));
		}
		else 
		{
			System.out.println("Two Roots, which are" + df.format(answer) + "and" + df.format(answer2));
		}
		
		
		
		
		
		
	}

}
