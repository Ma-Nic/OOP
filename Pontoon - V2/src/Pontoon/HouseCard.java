/* Matt Nicol
 * Pontoon
 * 26-10-18
 * Eclipse v4.9.0
 * cv2.0 *
 
package Pontoon;

//Create Dealers hand
public class HouseCard {
	
	public static int getHouseCard() 
	{
		int dealer = 0;
		int houseMin = 16;
		while (dealer <= houseMin)
		{
			dealer = dealer + RandomNumber.getRandomNumber();
		}
		return(dealer);
	}
	
	
//	public static boolean isBusted(int dealer)
//	{
//		if (dealer > 21) 
//		{
//		return(true);
//		}
//		else {
//		return(false);
//		}
//	}
}
