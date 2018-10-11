/* Matt Nicol
 * Media Library
 * 05-10-18
 * Eclipse v4.9.0
 * */

package medialibrary;

public class Media {

	
	//Declare strings mName and mDescription
	protected String mName;
	protected String mDescription;
	
	
	//Constructor for Media
	public Media(String Name, String Description) {
		setmName(Name);
		setmDescription(Description);
	}

	//mName getter
	public String getmName() {
		return mName;
	}
	
	//mName setter
	public void setmName(String Name) {
		mName = Name;
	}
	
	//mDescription getter
	public String getmDescription() {
		return mDescription;
	}
	
	//mDescription setter
	public void setmDescription(String Desc) {
		mDescription = Desc;
	}
}
