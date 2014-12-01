/**
 * @author Sami Williams
 * @date 30 November 2014
 * 
 * Creates KochLine class and its methods
 */

package edu.cofc.csci221.ui;

public class KochLine extends Line{
	private Point p1 = null;
	private Point p2 = null;
	private Point p3 = null;
	private Point p4 = null;
	private Point p5 = null;
	
	
	// Precondition: none
	// Postcondition: constructed KochLine and establishes
	// start and end points
	public KochLine (Point start, Point end){
		super(start, end);
		p1 = start;
		p5 = end;
	}
	
	// Precondition: none
	// Postcondition: will create new KochLine
	public Line getLineA(){
		KochLine lineA = new KochLine(p1, p2);
		return lineA;
	}
	
	// Precondition: none
	// Postcondition: will create new KochLine
	public Line getLineB(){
		KochLine lineB = new KochLine(p2, p3);
		return lineB;
	}
	
	// Precondition: none
	// Postcondition: will create new KochLine
	public Line getLineC(){
		KochLine lineC = new KochLine(p3, p4);
		return lineC;
	}
	
	// Precondition: none
	// Postcondition: will create new KochLine
	public Line getLineD(){
		KochLine lineD = new KochLine(p4, p5);
		return lineD;
	}
	
	// Precondition: none
	// Postcondition: computes coordinate values
	public void computeFractal(){
		int x51 = p5.getX() - p1.getX();
		int y51 = p5.getY() - p1.getY();
		int x2 = p1.getX() + (x51/3);
		int y2 = p1.getY() + (y51/3);
		int x3 = (int) (((p1.getX() + p5.getX())/2) + ((Math.sqrt(3) * (p1.getY() - p5.getY())/6)));
		int y3 = (int) (((p1.getY() + p5.getY())/2) + ((Math.sqrt(3) * (p5.getX() - p1.getX())/6)));
		int x4 = p1.getX() + ((2 * x51)/3);
		int y4 = p1.getY() + ((2 * y51)/3);

        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);

	}
	
	// Precondition: none
	// Postcondition: determines if KochLine is valid
	public boolean isKochLineValid(){
		boolean valid = true;
		Line lineA = new Line(p1, p2);
		if (lineA .isValid() == true){
			valid = true;
		}else{
			valid = false;
		}
		
		Line lineB = new Line(p2, p3);
		if (lineB.isValid() == true){
			valid = true;
		}else{
			valid = false;
		}
		
		Line lineC = new Line(p3, p4);
		if (lineC.isValid() == true){
			valid = true;
		}else{
			valid = false;
		}
		
		Line lineD = new Line(p4, p5);
		if (lineD.isValid() == true){
			valid = true;
		}else{
			valid = false;
		}
		
		return valid;
	}
	
}
