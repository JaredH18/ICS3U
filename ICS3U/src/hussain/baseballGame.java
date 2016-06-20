package hussain;
/* Jared Hussain
 * Baseball Program
 * This program gives the user 16 different players and information about them and the user has to try and name the player. At the end, the program shows the users score and the correct answers to all the questions
 * June 17, 2016
 * */

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import hsa_new.Console;

public class baseballGame {

	public static void main(String[] args) {

		String answer;
		int score = 0;
		Console baseball = new Console(45, 155);
		

		String userAnswer;

		String[] players = new String[] { "Jose Bautista", "Derek Jeter", "Tom Seaver", "David Ortiz", "Robinson Cano",
				"Clayton Kershaw", "Chris Sale", "Giancarlo Stanton", "Evan Longoria", "Jackie Robinson", "Alex Rodriguez", "Felix Hernandez", "Bryce Harper", "Yoenis Cespedes", "Roy Halladay", "Ken Griffey Jr" };

		String[] history = new String[] {
				"This player currently plays on the blue jays, he is a, 6-time all star, 3-time AL Silver Slugger Award Winner, and is having a late breakout career,\n Who is he? Full Name Please",
				"This player was one of the greatest shortstops of all time in history, He played for the yankees his whole career and retired just last year, \n He is a 14-time All Star, He won 5 championships, And was Rookie of the Year in 1996, Who is he? Full Name Please",
				"This player was one of the greatest pitchers to ever wear a mets uniform, He had a 20 season career before retiring in 1987, He is a 12-time All Star,\n He only won 1 championship, And was Rookie of the Year in 1967, Who is he? Full Name Please",
				"This player is one of the most respected players of all time, He is retiring after this year after spending most of his career and still currently on the \n Red Sox, He is a 9-time All Star, He won 6 AL Silver Slugger Awards,  And he has won 3 championships, Who is he? Full Name Please",
				"This player is a great second baseman, He became a star with the yankees until recently signing with the mariners in 2014, He is a 6-time All Star,\n He won only 1 championship which was in 2009, And is a 2-time AL Gold Glove Award Winner, Who is he? Full Name Please",
				"This player is one of the dominant pitchers in the game right now, He has played for the dodgers his whole career, He is a 5-time All Star, \n He won 3 CY Young Awards, And was NL MVP in 2014, Who is he? Full Name Please",
				"This player is arguably the best left handed pitcher right now, A rising star who has played his whole 6-year career with the White Sox, He is a 4-time All Star, \n And 2-time Rookie of the Month Winner, Who is he? Full Name Please",
				"This player is one of the highest payed players right now, He signed a 13 year/$325 million dollar contract 3 years ago, He is a 3-time All Star, \n And won the NL Silver Slugger Award back in 2014, Who is he? Full Name Please",
				"This player is a Fututre Hall of Famer for his Defensive Efforts from 3rd Base, He has played his whole career with the Tampa Bay Rays, He is a 3-time \n All Star, And 2-time Rawlings AL Gold Glove Winner, Who is he? Full Name Please",
				"This player changed the whole game completly, He was the first African American baseball player to ever play in the MLB, He played his whole career with the \n Brooklyn Dodgers, He is the only player who has his jersey number retired permanently throuout the whole MLB (#42), Who is he? Full Name Please",
				"This player would've been one of the best 3rd base players of all time until drugs got the best of him, He had been suspended multiple times throughout his career, \n He is a 14-time All Star, And 10-time AL Silver Slugger Award Winner, Who is he? Full Name Please",
				"This playerhas been a dominant pitcher since he had been drafted, Nicknamed King Felix, He has spent his whole career in Seattle , He is a 6-time All Star, \n And Won the AL CY-Young Award in 2010, Who is he? Full Name Please",
				"This player is one of the Rising Stars as we speak, He has been a an outstanding player for the Nationals and in his 4 short years in the league, \n He is a 3-time All Star, and He won both the NL Sliver Slugger Award and NL MVP just Last Year, Who is he? Full Name Please",
				"This player is one of the hardest and farthest throwers in the outfield right now,He won the home run derby back to back in 2013 and 2014, He was a \n Gold Glove Winner in 2015, He won 6 AL Silver Slugger Awards, And AL Rookie of the Month in 2012, Who is he? Full Name Please",
				"This player is by far the Greatest Pitchers in Blue Jays History, He retired in 2013, 3 years after being traded by the Blue Jays, He is a 8-time \n All Star, He won 2 CY-Young Awards, one from the American league in 2003 and the other from the national league in 2010, Who is he? Full Name Please",
				"This player is one of the only players to ever play with his Father on the Same Team, He retired in 2010 after playing 21 seasons in the MLB, He is a \n 12-time All Star, He won the MVP Award back in 1992, And he was inducted into the Hall of Fame in 2016, Who is he? Full Name Please"
				};
		
		Image[] pictures = new Image[] { Toolkit.getDefaultToolkit().getImage("joseBautista.jpg"),
				Toolkit.getDefaultToolkit().getImage("DerekJeter.jpg"),
				Toolkit.getDefaultToolkit().getImage("TomSeaver.jpg"),
				Toolkit.getDefaultToolkit().getImage("DavidOrtiz.jpg"),
				Toolkit.getDefaultToolkit().getImage("RobinsonCano.jpg"),
				Toolkit.getDefaultToolkit().getImage("ClaytonKershaw.jpg"),
				Toolkit.getDefaultToolkit().getImage("ChrisSale.jpg"),
				Toolkit.getDefaultToolkit().getImage("GiancarloStanton.jpg"),
				Toolkit.getDefaultToolkit().getImage("EvanLongoria.jpg"),
				Toolkit.getDefaultToolkit().getImage("JackieRobinson.jpg"),
				Toolkit.getDefaultToolkit().getImage("AlexRodriguez.jpg"),
				Toolkit.getDefaultToolkit().getImage("FelixHernandez.jpg"),
				Toolkit.getDefaultToolkit().getImage("BryceHarper.jpg"),
				Toolkit.getDefaultToolkit().getImage("YoenisCespedes.jpg"),
				Toolkit.getDefaultToolkit().getImage("RoyHalladay.jpg"),
				Toolkit.getDefaultToolkit().getImage("KenGriffey.jpg")};

		baseball.println("Hello, you have entered the world of baseball trivia");
		baseball.println("Unlike other games, I will not ask you any hard questions, I will show you backround knowlege about a player and you will have to guess him");
		baseball.println("Some players are known, and some not so much");
		baseball.println("Are you ready for the challenge? yes or no");
		answer = baseball.readLine();

		baseball.clear();

		if (answer.equalsIgnoreCase("yes")) {
			for (int i = 0; i <= 15; i++) {
				baseball.setFont(new Font("SansSerif", Font.BOLD, 50));
				baseball.drawString("Baseball Trivia", 400, 35);
				baseball.setFont(new Font("SansSerif", Font.PLAIN, 15));
				baseball.setCursor(5, 1);
				baseball.println(history[i]);
				baseball.setCursor(8, 3);
				baseball.drawImage(pictures[i], 100, 250, 1000, 500, null);
				userAnswer = baseball.readLine();

				score = scores( players, baseball, userAnswer, score, i);
				baseball.clear();
			}
			baseball.println("your score was " + score);
			baseball.println("all the correct answers are:");
			for(int i=0; i<=15; i++){
				correctAnswers(players, baseball, i); 
			}

		} else {
			baseball.println("guess we wont play then since your being a loser");
		}
		
		

	}
	public static int scores(String[] players, Console baseball, String userAnswer, int score, int i){
		if (userAnswer.equalsIgnoreCase(players[i])) {
			score = score + 1;
		}
		return score;
	}
	public static void correctAnswers(String[] players, Console baseball, int i){
		baseball.println(players[i]);
		
	}
	
	

}
