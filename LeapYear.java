/* Matt Nicol
 * Clock Code
 * 04-10-18
 * Eclipse v4.9.0
 * cv1.0 */

package Clock;

import java.util.GregorianCalendar;

public class LeapYear {

	
	public static void checkLeapyear(GregorianCalendar gcalendar, int year) {
    
		// Test if the current year is a leap year
	    if(gcalendar.isLeapYear(year)) {
	       System.out.println("The current year is a leap year");
	    }
	    else {
	       System.out.println("The current year is not a leap year");
	    }
	}
	
}
