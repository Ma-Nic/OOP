/* Matt Nicol
 * Pontoon
 * 26-09-18
 * Eclipse v4.9.0
 * cv1.0 */

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
