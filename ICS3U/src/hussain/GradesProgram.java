package hussain;

import java.util.Scanner;

public class GradesProgram {
	/* Jared Hussain
	 * Grades Program
	 * Asks how many people are in the class and asks marks for each student, then displays their grades
	 * March 30, 2016
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		int grade;
		int students;
		
		Scanner scan = new Scanner(System.in);
		
		// Inputs Information
		System.out.println("how many students are in the class?");
		students = Integer.parseInt(scan.nextLine());
		
		for (int i=0; i <= students ; i++){
			
			System.out.println("what are the marks?");
			grade = Integer.parseInt(scan.nextLine());
			
		// Displays Information
		if (grade <= 100 && grade >= 80)
		{
			System.out.println(grade + ", you got an A");
		}
		else if (grade <= 79 && grade >= 70)
		{
			System.out.println(grade + ", you got a B");
		}
		else if (grade <= 69 && grade >= 60)
		{
			System.out.println(grade + ", you got a C");
		}
		else if (grade <= 59 && grade >= 50)
		{
			System.out.println(grade + ", you got a D");
		}
		else if (grade <= 49 && grade >= 0)
		{
			System.out.println(grade + ", you got a F, you failed");
		}
		else
		{
			System.out.println("invalid grade");
		}
		
	}
		
}
}