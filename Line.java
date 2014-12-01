/**@author Sami Williams
 * @since 7 Oct. 2014
 * This program will create a new user interface with a rectangular grid
 * using classes Line and Point, as well as three user interface classes
 * imported as well as a test class.
 * 
 */


package edu.cofc.csci221.ui;

public class Line {
	
	// Private instance variables
	private Point start = null;
	private Point end = null;
	
	public Line (Point start, Point end){
		assert start!= null && end!=null: "Do nothing";
		this.start = start;
		this.end = end;
	}
	
	public Point getStart(){
		return start;
	}
	
	public Point getEnd(){
		return end;
	}
	
	public void setStart(Point start){
		if (start!=null){
			this.start = start;
		}
		else{
			
		}
	}
	
	public void setEnd(Point end){
		if (end!=null){
			this.end = end;
		}
		else{
			
		}
	}
	
	// Determines if start and end values are null, therefore valid
	public boolean isValid(){
		boolean valid = true;
		if (getStart() == null || getEnd() == null){
			valid = false;
		}
		return valid;
	}
}
