/* Matt Nicol
 * Media Library
 * 05-10-18
 * Eclipse v4.9.0
 * */

package medialibrary;

import java.util.Comparator;

//Compare media entries and organize alphabetically
public class mCompare implements Comparator<Media> {

	public int compare(Media m1, Media m2) {
		return m1.getmName().compareTo(m2.getmName());
	}
}
