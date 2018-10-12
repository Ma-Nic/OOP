/* Matt Nicol
 * Sink A Dot Com
 * 11-10-18
 * Eclipse v4.9.0
 * */

package SinkADotCom;

public class SimpleDotCom {

	//Declare array for locationCells, set numOfHits int to 0
	int[] locationCells;
	int numOfHits = 0;
	
	//Setter for locationCells
	public void setLocationCells(int[] locs) { 
		locationCells = locs;
	}
	
	//Check user guess method, change string to int
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		
		//Declare result, set it to "miss"
		String result = "miss";
		
		//Check if user guess matches DotCom location, set result to "hit" if so
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		//Check if all DotCom locations are hit, set result to "kill" if so  
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		
		//Print and return result
		System.out.println(result);
		return result;
	}
	
}
