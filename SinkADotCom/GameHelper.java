/* Matt Nicol
 * Sink A Dot Com
 * 11-10-18
 * Eclipse v4.9.0
 * */

package SinkADotCom;

import java.io.*;

public class GameHelper {

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) 
				return null;
		}
			catch (Exception e) {
				System.out.println("IOException " + e);
			}
		return inputLine;
	}
	
}
