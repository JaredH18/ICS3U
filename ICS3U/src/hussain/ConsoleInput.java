package hussain;
/* console program
 * March 9, 2016
 * This program asks for your Age and birth year as well as your mother and calculates how old she was when you were born
 */

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] arges) {
	
		int mothersAge;
		int kidsAge;
		String nameOfMother;
		String nameOfChild;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mothers Name");
		nameOfMother = scan.nextLine();
		System.out.println("When was your mother born?");
		mothersAge = Integer.parseInt(scan.nextLine());
		System.out.println("Your Name");
		nameOfChild = scan.nextLine();
		System.out.println("When were you born?");
		kidsAge = Integer.parseInt(scan.nextLine());
		
		System.out.println("Your mothers name is" + nameOfMother);
		System.out.println("She was born in" + mothersAge);
		System.out.println("Your name is" + nameOfChild);
		System.out.println("You were born in" + kidsAge);
		System.out.println("your mom was " + (mothersAge - kidsAge) + "when you were born" );
		
		
		
		
		
}

}
