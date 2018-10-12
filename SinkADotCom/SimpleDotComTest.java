/* Matt Nicol
 * Sink A Dot Com
 * 11-10-18
 * Eclipse v4.9.0
 * */

package SinkADotCom;

public class SimpleDotComTest {
	
	public static void main (String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}

}
