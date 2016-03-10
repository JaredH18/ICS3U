package hussain;


import java.util.Scanner;

public class ArithmeticExpression {
	/* Jared Hussain
	 * Arithmetic Program
	 * Inputs 5 numbers and outputs various answers using various equations
	 */

	public static void main(String[] arges) {	

		double num1;
		double num2;
		double num3;
		double num4;
		double num5;

		Scanner scan = new Scanner(System.in);



		System.out.println("Number 1?");
		num1 = Double.parseDouble(scan.nextLine());
		System.out.println("Number 2?");
		num2 = Double.parseDouble(scan.nextLine());
		System.out.println("Number 3?");
		num3 = Double.parseDouble(scan.nextLine());
		System.out.println("Number 4?");
		num4 = Double.parseDouble(scan.nextLine());
		System.out.println("Number 5?");
		num5 = Double.parseDouble(scan.nextLine());

		System.out.println("The sum of all 5 integers is" + (num1 + num2 + num3 + num4 + num5));
		System.out.println("when you subtract the third number from the second, the answer is" + (num3 - num2));
		System.out.println("when you multiply the first and fifth number, the answer is" + (num1 * num5));
		System.out.println("when you divide the fourth number by the second, the answer is" + (num4 / num2));
		System.out.println("remainder when dividing the fourth number by the second is" + (num4 % num2));
		System.out.println("the first number raised to the raised to the power of the third number is" + Math.pow(num1,num3));
		System.out.println("The square root of the fifth number is" + Math.sqrt(num5));
	}
}	
