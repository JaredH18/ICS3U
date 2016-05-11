package hussain;

import java.util.Scanner;

public class WordGuess {
	/* Jared Hussain
	 * Word Guess Program
	 * user plays a guessing game with the computer
	 * May 11, 2016
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String[] realWord = new String[] { "train", "runnymede", "school", "human", "heat", "building", "airplane", "soccer",
				"brain", "thunder" };
		int randomGuess;
		Scanner scan = new Scanner(System.in);
		String letters = null;
		String words;
		int  numbers;
		boolean completeWord = false;

		//gets the word
		randomGuess = (int) (Math.random() * realWord.length);
		String word = "";

		for (int i = 0; i < realWord[randomGuess].length(); i++) {
			word = word + "-";
		}

		System.out.println(word);

		do{
			if (word.equals(realWord[randomGuess])){
				completeWord = true;
			}else{
				System.out.println("Guess a letter you are confident with");
				letters = scan.nextLine();
				if (letters.equals("!")){
					completeWord = true;
				}
				else{

					numbers = realWord[randomGuess].indexOf(letters);
					if (numbers== -1){
						System.out.println("that letter fis not found");
					}
					else{
						word = word.substring(0, numbers) + letters + word.substring ((numbers+1), word.length()); 

						System.out.println(word);
					}
				}
			}
		} while (!completeWord);
		
		if (letters.equals("!")){
			System.out.println("Enter the word you think it is");
			words = scan.nextLine();
			if (words.equals(realWord[randomGuess])){
				System.out.println("Congrats you won!");
			}
			else {
				System.out.println("You Lost");
			}
		}
		else {
			System.out.println("You won!");
		}



		}
	
	}
	


