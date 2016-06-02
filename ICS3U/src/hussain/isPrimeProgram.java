package hussain;

import java.util.Scanner;

public class isPrimeProgram {
	/* Jared Hussain
	 * Is Prime Program
	 * A program that gets a number from the user and checks if it is prime number
	 * May 30, 2016
	 */
	

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		int number;
		System.out.println("Please enter a number. I will tell you if it is a prime number or not");
		number = scan.nextInt();
		
		if (isPrime(number))
		{
			System.out.println(number+" is a prime number.");
		}
		else
		{
			System.out.println(number+" is not a prime number.");
		}

	}
	
	
	public static boolean isDivisible(int number, int i) {
		
		
		if(number%i!=0)
		{
			return (false);
		}
	
		return(true);
	
	}
	
	public static boolean isPrime(int number){
	
		if(number==0||number==1)
		{
			return(false);
		}
	
		for(int i=2;i<number;i++)
		{
			if(isDivisible(number, i)==true)
			{
				return (false);
			}
		}
		return(true);
	}

}
