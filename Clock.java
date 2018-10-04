/* Matt Nicol
 * Clock Code
 * 04-10-18
 * Eclipse v4.9.0
 * cv1.0 */

package Clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock {

	public void ticking() {
		 
	    // Create date object, print current date
		Date date = new Date();
	    System.out.println(date.toString());
	       
	    // Create dNow object, specify format, print in format
	    Date dNow = new Date( );
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    System.out.println("Current Date: " + ft.format(dNow));
	       
	    
	    	//Fetch months, declare year variable
	    	String[] months = Dates.getMonth();
	    	int year;
	    		          		              		      
	    	// Create a Gregorian calendar
	        GregorianCalendar gcalendar = new GregorianCalendar();
	    		      
	    		      
		      // Display current time and date information.
		      System.out.print("Date: ");
		      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		      System.out.println(year = gcalendar.get(Calendar.YEAR));
		      System.out.print("Time: ");
		      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		      System.out.println(gcalendar.get(Calendar.SECOND));
	    		      
	    	  //Check if it's a leap year
		      LeapYear.checkLeapyear(gcalendar, year);
	}
}

