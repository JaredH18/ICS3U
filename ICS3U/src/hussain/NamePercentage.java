package hussain;
/* This program inputs a persons names and calculate 705 of the time that they like it or 30% of the time that they hate it
 * Jared Hussain
 * March 23, 2016
 */

import java.util.Scanner;

public class NamePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Favourite;
		String PersonsName;
		
		
		Favourite = (int) (Math.random() * 10);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Whats your name?");
		PersonsName = scan.nextLine();
		
		if (Favourite >=0 && Favourite <=2)
		{
			System.out.println( PersonsName + "I hate that name");
		}
		else if (Favourite >=3 || Favourite <=9)
		{
			System.out.println( PersonsName + "I like that name");
		}
	}

}
