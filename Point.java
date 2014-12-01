/**@author Sami Williams
 * @since 7 Oct. 2014
 * This program will create a new user interface with a rectangular grid
 * using classes Line and Point, as well as three user interface classes
 * imported as well as a test class.
 * 
 */


package edu.cofc.csci221.ui;

public class Point {
	
	// Private instance variables
	private int x = 0;
	private int y = 0;
	
	public Point (){
		x = 0;
		y = 0;
		
	}
	
	// Constructor method
	public Point (Point point){
		assert point != null: "Point not null";
		if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
			setPoint(point);
		}
		else{
			x = 0;
		}
	}
	public Point (int x, int y){
		if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
			this.x = x;
		}
		else{
			x = 0;
		}
		if (y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
			this.y = y;
		}
		else{
			this.x = 0;
		}
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
			this.x = x;
		}
	}
	public void setY(int y){
		if (y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
			this.y = y;
		}
		else{
			this.y = 0;
		}
	}
	
	// P is not null, sets X and Y points
	public void setPoint(Point p){
		assert p!=null: "Precondition met";
		assert p==null: "Do nothing";
		if (p!=null){
			setX(p.getX());
			setY(p.getY());
		}
	}
}
