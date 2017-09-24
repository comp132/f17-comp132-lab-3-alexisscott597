package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Drawable, Scaleable{
	
	  	private int x;
	    private int y;
	    private int width;
	    private int length;
	    private Color theColor;
	    private boolean isVisible;
/*
 * Makes a rectangle beginning at a given coordinate with a width, length, and color
 */
	public Rectangle(int x, int y, int width, int length, Color color)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		theColor = color;
		isVisible = true;
		
	}
/*
 * returns x coordinate of rectangle
 */
	public int getX()
	{
		return x;
	}
/*
 * returns y coordinate of rectangle
 */
	public int getY()
	{
		return y;
	}
/*
 * returns rectangle's length
 */
	
	public int getLength()
	{
		return length;
	}
/*
 * returns rectangle's width
 */
	public int getWidth()
	{
		return width;
	}
/*
 * 
 * scales rectangle by a given factor
 */
	@Override
	public void scale(double factor) {
		if (factor > 0){
		width = (int) Math.round(width * factor);
		length = (int) Math.round(length * factor);
		}	
	}
/*
 * draws the rectangle
 */
	@Override
	public void draw(Graphics g) {
		g.setColor(theColor);
		g.fillRect(x, y, width, length);
		
	}
	
/*
 * returns the rectangle's color
 */

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return theColor;
	}
	
	/*
	 * sets the rectangle's color
	 */
	
	@Override
	public void setColor(Color newColor) {
		theColor = newColor;
		
	}
	
	/*
	 * sets the rectangle as being visible
	 */

	@Override
	public void setVisible(boolean visible) {
		isVisible = visible;
		
	}
	
	/*
	 * returns the rectangle's visibility
	 */

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return isVisible;
	}
	
	/*
	 * sets the rectangle's width
	 */
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	/*
	 * sets the rectangle's length
	 */
	
	public void setLength(int l)
	{
		length = l;
	}
	
	/*
	 * moved the rectangle to a given coordinate
	 */
	
	public void move(int newX, int newY) {
	        x = newX;
	        y = newY;
	    }
	
	/*
	 * translates the rectangle by a given x and y
	 */
	  
	public void translate(int deltaX, int deltaY) {
	        x = x + deltaX;
	        y = y + deltaY;
	    }

}
