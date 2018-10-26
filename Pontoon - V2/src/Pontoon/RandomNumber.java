/* Matt Nicol
 * Pontoon
 * 26-09-18
 * Eclipse v4.9.0
 * cv1.0 */

package Pontoon;

//Generate random number between 1-10

public class RandomNumber {
	
	public static int getRandomNumber()
	{ 
		int getRandomNumber = (int)(Math.random()*10 + 1);
		return(getRandomNumber);
	}

}
