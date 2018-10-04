package Pontoon;

public class DisplayCard {

	//Display played cards at end of hand
	public static void displayCards(int cardsDrawn[])
	{
		System.out.print("Cards drawn: ");
		for (int x = 1;x<10;x++)
		{
		if (cardsDrawn[x]!=0)
				if (x==1)
					System.out.print(cardsDrawn[x]);
				else
					System.out.print(","+cardsDrawn[x]);	
		}
		System.out.println();
	}
	
}
