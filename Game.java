package Pontoon;

import java.util.Scanner;

public class Game {

	public static void main (String args []) {
		
	Scanner kboard = new Scanner(System.in);
	
	String choice;
	int card1 = 0;
	int card2 = 0;
	int newCard;
	int cTotal;
	int house;
	int houseMin = 16;
	int cardCount = 3;
	int cDrawn[] = new int [10];
	
	house = HouseCard.getHouseCard(houseMin);
	cDrawn[0] = house;
	card1 = RandomNumber.getRandomNumber();
	cDrawn[1] = card1;
	card2 = RandomNumber.getRandomNumber();
	cDrawn[2] = card2;
	cTotal = CardTotal.getCardTotal(card1, card2);
	
	
	System.out.println("Your drawn cards are "+card1+" and "+card2);
	System.out.println("Your card total is "+cTotal);
	System.out.println("Do you wish to draw another card y/n?");
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
	if (CardTotal.busted(cTotal) == true)
	{
		System.out.println("You busted out!");
	}
	else if (CardTotal.getResult(cTotal, house) == true) {
		System.out.println("You beat the dealer!");
	}
	else {
		System.out.println("You lose!");
	}
	System.out.println("The house had " +house);
	System.out.println("Your drawn cards are ");
	DisplayCard.displayCards(cDrawn);
	System.out.println("See you next time");
	
	kboard.close();
	}
	
}
