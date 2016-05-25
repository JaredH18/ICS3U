package hussain;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMathTwo {
	/* Jared Hussain
	 * Fun With Math Two Program
	 * User gives computer two numbers. computer adds, subtracts, multiplies, and divides them using methods
	 * May 25, 2016
	 */

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000");
		
		Scanner scan = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Give me two numbers, I will then add them, subtract them, multipy them, then divide them");
		System.out.println("what is your first number?");
		num1 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your second number?");
		num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("when you add them, the answerr is " + df.format (addNumbers(num1, num2)));
		System.out.println("when you subtract them, the answer is " + (subtractNumbers(num1, num2)));
		System.out.println("when you multiply them, the answer is " + (multiplyNumbers(num1, num2)));
		System.out.println("when you divide them, the answer is " + df.format(divideNumbers(num1, num2)));
		
		
	}
	
	public static double addNumbers( double num1, double num2){
		
		double total = num1 + num2;
		return total;
		
		
	}
	public static double subtractNumbers( double num1, double num2){
		
		double total = num1 - num2;
		return total;
		
		
	}
	public static double multiplyNumbers( double num1, double num2){
		
		double total = num1 * num2;
		return total;
		
		
	}
	public static double divideNumbers( double num1, double num2){
		
		double total = num1 / num2;
		return total;
		
		
	}

}
