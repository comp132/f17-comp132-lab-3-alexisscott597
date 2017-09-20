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

	public Rectangle(int x, int y, int width, int length, Color color)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		theColor = color;
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	@Override
	public void scale(double factor) {
		if (factor > 0){
		width = (int) Math.round(width * factor);
		length = (int) Math.round(length * factor);
		}	
	}

	@Override
	public void draw(Graphics g) {
		
		g.setColor(theColor);
		g.drawRect(x, y, width, length);
		
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return theColor;
	}

	@Override
	public void setColor(Color newColor) {
		theColor = newColor;
		
	}

	@Override
	public void setVisible(boolean visible) {
		isVisible = visible;
		
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return isVisible;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setLength(int l)
	{
		length = l;
	}
	
	
	public void move(int newX, int newY) {
	        x = newX;
	        y = newY;
	    }
	  
	public void translate(int deltaX, int deltaY) {
	        x = x + deltaX;
	        y = y + deltaY;
	    }

}
