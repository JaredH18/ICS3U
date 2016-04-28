package hussain;

public class DiceRollGame {
	/* Jared Hussain
	 * Dice Roll Game Program
	 * Two dice at random for the user is rolled 10000 times and displays how much times each numberis rolled after the 10000 rolls
	 * April 28, 2016
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1, dice2, n;
		
		String[] roll = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		
		int[] sum = new int [11];
		
		for (int x = 0; x <= 9999; x++){
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;
		n = dice1 + dice2;
		
		
		if (n ==2) {
			sum[0]++;
		} else if (n ==3) {
			sum[1]++;
		} else if (n ==4) {
			sum[2]++;
		} else if (n ==5) {
			sum[3]++;
		} else if (n ==6) {
			sum[4]++;
		} else if (n ==7) {
			sum[5]++;
		} else if (n ==8) {
			sum[6]++;
		} else if (n ==9) {
			sum[7]++;
		} else if (n ==10) {
			sum[8]++;
		} else if (n ==11) {
			sum[9]++;
		} else if (n ==12) {
			sum[10]++;
		}
		}
		System.out.println("Total		Number of rolls" );
		
		for (int x = 0; x <= 10; x++){
			System.out.println(roll[x] + "		" + sum[x] );
		}
		
		

	}

}
