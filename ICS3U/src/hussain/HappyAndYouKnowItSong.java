package hussain;

public class HappyAndYouKnowItSong {
	/* Jared Hussain
	 * Happy and you know it game Program
	 * Program that sings the happy and you know it songs 10 times with different endings for each
	 * April 27, 2016
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] verses = new String [] { "run around", "shoot some hoops", "go and play", "jump around", "stomp around", "go and sleep", "go and eat", "go play games", "go and run", "win the game"};
		for (int x=0; x<=9; x++)
		{
			System.out.println("if your happy and you know it " + verses[x]);
			System.out.println("if your happy and you know it " + verses[x]);
			System.out.println("if your happy and you know it and you really want to show it " + verses[x]);
			System.out.println("if your happy and you know it " + verses[x]);
			System.out.println("");
		}
}

}