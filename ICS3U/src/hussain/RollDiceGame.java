package hussain;
/* Jared Hussain
 * Arithmetic Program
 * roll dice for the user and computer and the higher number wins the game
 * March 24, 2016
 */

public class RollDiceGame {

	public static void main(String[] args) {
		
		// sets variables 
		int UserDice1;
		int UserDice2;
		int ComputerDice1;
		int ComputerDice2;
		int Player;
		int Computer;
		
		
		UserDice1 = (int)(Math.random() * 6) + 1;
		UserDice2 = (int)(Math.random() * 6) + 1;
		ComputerDice1 = (int)(Math.random() * 6) + 1;
		ComputerDice2 = (int)(Math.random() * 6) + 1;
		
		// calculates information
		Player = UserDice1 + UserDice2;
		Computer = ComputerDice1 + ComputerDice2;
		
		if (Player > Computer)
		{
			System.out.println("Player: " + Player + " Computer: " + Computer);
			System.out.println("you won");
		}
		else if  (Player < Computer)
		{
			System.out.println("Player: " + Player + " Computer: " + Computer);
			System.out.println("you lost");
		}
		else{
			System.out.println("Player: " + Player + " Computer: " + Computer);
			System.out.println("tie game");
		}
	}

}
