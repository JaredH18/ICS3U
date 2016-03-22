package hussain;
/*If program
 * Inputs a number, calculates if it is negative or positive and also calculates if it can be divided by 7 or not
 * Jared Hussain
 * March 22, 2016
 */
import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number;
		
		Scanner scan = new Scanner(System.in);
		
		// collect information
		System.out.println("what is your number?");
		Number = Integer.parseInt(scan.nextLine());
		
		// calculate and display output
		if (Number > 0)
		{
			System.out.println("your number is positive");
		}
		else 
		{
			System.out.println("your number is negative");
		}
		if (Number % 7 == 0)
		{
			System.out.println("your number can be divided by 7");
		}
		else
		{
			System.out.println("your number cannot be divided by 7");
		}
		
	}
	

}
