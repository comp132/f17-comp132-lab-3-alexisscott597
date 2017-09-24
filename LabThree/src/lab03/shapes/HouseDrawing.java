package lab03.shapes;

import java.awt.Color;

public class HouseDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawableObjectList d1 = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("House",200,200,d1);
		
		Rectangle r1 = new Rectangle(50,150,100,50, Color.CYAN);
		d1.addDrawable(r1);
		Line l1 = new Line(50,100,150,100,Color.CYAN);
		d1.addDrawable(l1);
		Line l2 = new Line(100,149,100,150,Color.CYAN);
		d1.addDrawable(l2);
		Rectangle r2 = new Rectangle(95,175,10,25, Color.MAGENTA);
		d1.addDrawable(r2);
		Rectangle r3 = new Rectangle(95,160,10,10, Color.BLACK);
		d1.addDrawable(r3);
		Circle c1 = new Circle(102,185,2,Color.darkGray);
		d1.addDrawable(c1);
		
	
		
		tablet.repaint();
		for(int i=0;i<100;i++)

		{
			
		
		AnimationTimer.sleep(500);
		
		
		r1.setColor(Color.BLUE);
		
		tablet.repaint();
		
		AnimationTimer.sleep(500);
		
		r1.setColor(Color.CYAN);
		
		tablet.repaint();
		
		
		}
		
	}

}
