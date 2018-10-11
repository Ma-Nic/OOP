/* Matt Nicol
 * Media Library
 * 05-10-18
 * Eclipse v4.9.0
 * */

package medialibrary;

import java.util.ArrayList;
import java.util.Collections;

public class MediaLibrary {
	
	//Create resizable array 
	ArrayList<Media> mArray = new ArrayList<Media>();
	
	public void library() {
		
	}
	
	//Add new media, sort alphabetically through comparator
	public void addMedia(Media newMedia) {
		mArray.add(newMedia);
		Collections.sort(mArray, new mCompare());
	}
	
	//Print Media name and description to console
	public void printMedia()
	{
		for(int i = 0; i < mArray.size(); i++) {
			System.out.println("Name: " + mArray.get(i).getmName());
			System.out.println("Description: " + mArray.get(i).getmDescription());
		}		
	}
	
	//Loop through Array, return int i if mName exists in array, else return null
	public Media findMedia(String mName)
	{
		for(int i = 0; i < mArray.size(); i++) {
			if(mArray.get(i).getmName().equals(mName)) {
				return mArray.get(i);
			}
		}
		return null;
	}
		
	//Main arguments, create new MediaLibrary object and run acceptance test
	public static void main (String[] args) {
		MediaLibrary mLibrary = new MediaLibrary();
		MediaLibraryTest_w3.acceptanceTest(mLibrary);	
	}
}
