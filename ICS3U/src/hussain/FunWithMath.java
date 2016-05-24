package hussain;

import java.util.Scanner;

public class FunWithMath {
	/* Jared Hussain
	 * Fun With Math Program
	 * User gives computer two numbers. computer adds, subtracts, multiplies, and divides them using methods
	 * May 24, 2016
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Give me two numbers, I will then add them, subtract them, multipy them, then divide them");
		System.out.println("what is your first number?");
		num1 = Double.parseDouble(scan.nextLine());
		System.out.println("what is your second number?");
		num2 = Double.parseDouble(scan.nextLine());
		
		addNumbers(num1, num2);
		subtractNumbers(num1, num2);
		multiplyNumbers(num1, num2);
		divideNumbers(num1, num2);
		
		
	}
	
	public static void addNumbers( double num1, double num2){
		
		double total = num1 + num2;
		System.out.println("when you add them, the answerr is " + total);
		
		
	}
	public static void subtractNumbers( double num1, double num2){
		
		double total = num1 - num2;
		System.out.println("when you subtract them, the answer is " + total);
		
		
	}
	public static void multiplyNumbers( double num1, double num2){
		
		double total = num1 * num2;
		System.out.println("when you multiply them, the answer is " + total);
		
		
	}
	public static void divideNumbers( double num1, double num2){
		
		double total = num1 / num2;
		System.out.println("when you divide them, the answer is " + total);
		
		
	}

}
