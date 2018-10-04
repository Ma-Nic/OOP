/* Matt Nicol
 * Pontoon
 * 26-09-18
 * Eclipse v4.9.0
 * cv1.0 */

package Pontoon;


public class CardTotal {
	
	//Calculate card total
	public static int getCardTotal(int card1, int card2)
	{
		return(card1+card2);
	}

	//Determine if player has busted out
	public static boolean busted(int cTotal)
	{
		if (cTotal > 21)
			return(true);
		else
			return(false);
	}
	
	//Determine if hand meets winning criteria
	public static boolean getResult(int cTotal, int house)
	{
		if (cTotal>house && cTotal<=21)
			return(true);
		else
			return(false);
	}
	
}
