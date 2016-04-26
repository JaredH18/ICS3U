package hussain;
/* List of Names Program
 * Ask user for amount of names and then asks for the names. Then displays the names entered and the displays them backwards
 * Jared Hussain
 * April 26, 2016
 */

import java.util.Scanner;

public class ListOfNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of names");
		
		
		
		int NumofNames = Integer.parseInt(scan.nextLine());
		
		String [] names = new String [NumofNames];
		
		System.out.println("enter the names");
		for (int x=0; x<NumofNames; x++)
		{
			names[x] = scan.nextLine();
		}
		
		System.out.println("the names you entered are");
		for (int x=0; x<NumofNames; x++)
		{
			System.out.println(names[x]);
		}
		System.out.println("names from last to first");
		for (int x=NumofNames-1; x>=0; x--)
		{
			System.out.println(names[x]);
		}
	}

	
	
}
