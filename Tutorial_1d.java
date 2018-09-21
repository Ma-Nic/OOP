	/*Matt Nicol
	 19-09-18
	 OOP HND Computing
	 Eclipse IDE for Java Developers
	 (4.8.0)*/

package Tutorial_1d;

// import java.util.Arrays;
import java.util.Scanner;

public class Tutorial_1d {

		public static int getRandomNumber()
		{ 
			int getRandomNumber = (int)(Math.random()*10 + 1);
			return(getRandomNumber);
		}
		
		public static int getHouseCard(int x) 
		{
			int dealer = 0;
			while (dealer <= x)
			{
				dealer = dealer + getRandomNumber();
			}
			return(dealer);
		}
		
		public static int calcTotal(int card1, int card2)
		{
			return(card1+card2);
		}
		
		public static boolean busted(int cTotal)
		{
			if (cTotal > 21)
				return(true);
			else
				return(false);
		}
			
		public static boolean getResult(int cTotal, int house)
		{
			if (cTotal>house && cTotal<=21)
				return(true);
			else
				return(false);
		}
		
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
		
		house = getHouseCard(houseMin);
		cDrawn[0] = house;
		card1 = getRandomNumber();
		cDrawn[1] = card1;
		card2 = getRandomNumber();
		cDrawn[2] = card2;
		cTotal = calcTotal(card1, card2);
		
		
		System.out.println("Your drawn cards are "+card1+" and "+card2);
		System.out.println("Your card total is "+cTotal);
		System.out.println("Do you wish to draw another card y/n?");
		choice = kboard.next();
		
		while (choice.equalsIgnoreCase("y"))
			{
			newCard = getRandomNumber();
			System.out.println("Your new card is "+newCard);
			cTotal = cTotal + newCard;
			cDrawn[cardCount++] = newCard;
			
			System.out.println("Your new card total is "+cTotal);
			System.out.println("Do you wish to draw another card y/n?");
			choice = kboard.next();
			}
		if (busted(cTotal) == true)
		{
			System.out.println("You busted out!");
		}
		else if (getResult(cTotal, house) == true) {
			System.out.println("You beat the dealer!");
		}
		else {
			System.out.println("You lose!");
		}
		System.out.println("The house had " +house);
		System.out.println("Your drawn cards are ");
		displayCards(cDrawn);
		System.out.println("See you next time");
		
		kboard.close();
		}
}
