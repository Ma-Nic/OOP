/* Matt Nicol
 * Pontoon
 * 26-09-18
 * Eclipse v4.9.0
 * cv1.0 */

package Pontoon;

public class Game {

	public static void main (String args []) {

	//Declare variables
	int card1 = 0;
	int card2 = 0;
	int cTotal;
	int house;
	int cDrawn[] = new int [10];
	
	//Draw first cards for player and house
	house = HouseCard.getHouseCard();
	cDrawn[0] = house;
	card1 = RandomNumber.getRandomNumber();
	cDrawn[1] = card1;
	card2 = RandomNumber.getRandomNumber();
	cDrawn[2] = card2;
	cTotal = CardTotal.getCardTotal(card1, card2);
	
	DrawCards.start(card1, card2, cTotal);
	DrawCards.continuePlay(cTotal, cDrawn);
	PlayerTotal.endGame(cTotal, house, cDrawn);
	}
	
}
