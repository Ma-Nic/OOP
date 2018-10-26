package Pontoon;

public class PlayerTotal {

	public static void endGame(int cTotal, int house, int cDrawn[]) {
	//Check player total and determine result
	if (CardTotal.isBusted(cTotal) == true)
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
	}
}
