package Pontoon;

import java.util.Scanner;

public class DrawCards {
	public static void start(int card1, int card2, int cTotal) 
	{
		//Display players first cards
		System.out.println("Your drawn cards are "+card1+" and "+card2);
		System.out.println("Your card total is "+cTotal);
		System.out.println("Do you wish to draw another card y/n?");
	}	
		
	public static int continuePlay(int cTotal, int cDrawn[]) 
	{	
		Scanner kboard = new Scanner(System.in);
		int newCard;
		int cardCount = 3;
		String choice;
		
		//Continue play as long as player chooses y
		choice = kboard.next();
		while (choice.equalsIgnoreCase("y"))
			{
			newCard = RandomNumber.getRandomNumber();
			System.out.println("Your new card is "+newCard);
			cTotal = cTotal + newCard;
			cDrawn[cardCount++] = newCard;
			
			System.out.println("Your new card total is "+cTotal);
			System.out.println("Do you wish to draw another card y/n?");
			choice = kboard.next();	
			}
		kboard.close();
		return (cTotal);
	}
}
