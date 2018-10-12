/* Matt Nicol
 * Sink A Dot Com
 * 11-10-18
 * Eclipse v4.9.0
 * */

package SinkADotCom;

public class DotComGame {

	public static void main (String[] args) {
		int numOfGuesses = 0;
		
		//Helper for user input, create game instance
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		//Generate random number and add 2, set locations of DotCom
		int randomNum = (int) (Math.random() * 5);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		
		//Test if game is still alive, continue while true
		boolean isAlive = true;
		while (isAlive == true) {
			String guess = helper.getUserInput("Enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			
			//End game when DotCom is killed
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
	
}
