package Test;

import java.util.*;
public class Ramdom {
	
	public static void main(String args[])
	{
		int playCount = 0;
		Scanner scan = new Scanner(System.in);
//		for generating the score
		int score = 0 ;
		Random rand = new Random();
//		random number between 1 to 100
		int randomNumber = rand.nextInt(100) + 1;
		while(true)
		{
			System.out.println("Guess the Random Number ");
			int guess = scan.nextInt();
			playCount++;
			if(randomNumber == guess)
			{
				System.out.println("The guess is correct :) hurray...!");
				System.out.println("the Number of attemps you made to win is :" + playCount);
				if(playCount == 1)
				{
					System.out.println("WOW...! you scored 100% .");
				}
				else if(playCount < 10) {
					System.out.println("Good..! you scored 75% .");
				}
				else {
					System.out.println("Better luck next time for scoring best percentage %");
				}
				break;
			}
			else if(guess > randomNumber)
			{
				System.out.println("Nope .! the guessed number is greater :(");
			}
			else {
				System.out.println("Nope.! the guessed number is smaller :(");
			}
		}
	}

}
// we did it... :) 
//  THank YOU
