package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Drawable {
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color theColor;
	private Boolean isVisible;
	
	public Line (int x1, int x2, int y1, int y2, Color c)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		theColor = c;
	}
	
	public int getx1()
	{
		return x1;
	}
	
	public int getx2()
	{
		return x2;
	}
	
	public int gety1()
	{
		return y1;
	}
	
	public int gety2()
	{
		return y2;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(x1, y1, x2, y2);
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
		
		return isVisible;
	}
	
	

}
