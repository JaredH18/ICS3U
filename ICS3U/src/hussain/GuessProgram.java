package hussain;

import java.util.Scanner;

public class GuessProgram {
	/* Jared Hussain
	 * Guessing Game Program
	 * Asks user to play a game. user thinks of an nba team and computer tries to guess it. if computer reached all the guesses, user wins. if computer guesses correct, it wins
	 * May 2, 2016
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] guess = new String[] { "Toronto Raptors", "Miami Heat", "Charlotte Hornets", "New Orleans Pelicans",
				"San Antonio Spurs", "Cleveland Cavaliers", "Oklahoma City Thunder", "Los Angeles Lakers",
				"Boston Celtics", "Atlanta Hawks", "Indiana Pacers", "Dallas Mavericks", "Houston Rockets",
				"Portland Trailblazers", "Chicago Bulls", "Detroit Pistons", "Denver Nuggets", "Sacramento Kings",
				"Phoenix Suns", "Milwaukee Bucks" };
		boolean[] computerGuess = new boolean[20];
		String answer = null;
		int n;
		System.out.println("Hey, lets play a game. Think of an NBA team and I have to guess it");
		System.out.println("Wanna Play?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Lets go, think of the team");
			for (int x = 19; x > -1; x--) {
				n = (int) (Math.random() * guess.length);
				while (computerGuess[n]) {
					n = (int) (Math.random() * guess.length);
				}

				if (!computerGuess[n]) {
					System.out.println("Are you thinking of the " + guess[n] + "?");
					System.out.println("Yes or No?");
					answer = scan.nextLine();

					if (answer.equalsIgnoreCase("yes")) {
						System.out.println("I won since i guessed your team haha");
						x = 0;
					} else{
						 
						computerGuess[n]= true;
					}

				}
			}
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println(" ");
				
			}
			else {
				System.out.println("i give up, you win");
			}
			
		}
		else {
			System.out.println("ok fine have a good day");
		}

	}

}
