package Pontoon;

//Create Dealers hand

public class HouseCard {
	public static int getHouseCard(int x) 
	{
		int dealer = 0;
		while (dealer <= x)
		{
			dealer = dealer + RandomNumber.getRandomNumber();
		}
		return(dealer);
	}
}
