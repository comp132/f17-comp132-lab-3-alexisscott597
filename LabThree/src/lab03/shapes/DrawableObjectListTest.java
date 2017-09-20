package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics;

import org.junit.Before;
import org.junit.Test;

public class DrawableObjectListTest {
	
	private DrawableObjectList d;
	
	
	 @Before
	    public void setUp() throws Exception {
	        /*
	         * Construct all of the objects being used in the test fixture here.
	         */
		 d=new DrawableObjectList();
		
		 
	     }
	 @Test
	 public void drawableObjectTest()
	 {
		 assertSame("DrawableObjectList did not initialize size of list correctly",0,d.getSize());
	 }
	 @Test
	 public void testGetSize()
	 {
		 Drawable obj = new Circle(0,0,3, Color.BLACK);
		 System.out.println(d.getSize());
		 d.addDrawable(obj);
		 System.out.println(d.getSize());
		 assertSame("DrawableObjectList did not initialize size of list correctly",1,d.getSize());
		 d.removeDrawable(obj);
		 assertSame("DrawableObjectList did not initialize size of list correctly",0,d.getSize());
	 }
	 @Test
	 public void testAddDrawable()
	 {
		 Drawable obj = new Circle(0,0,3, Color.BLACK);
		 d.addDrawable(obj);
		 assertSame("DrawableObjectList did not initialize size of list correctly",1,d.getSize());
	 }
	 @Test
	 public void testRemoveDrawable()
	 {
		 Drawable obj = new Circle(0,0,3, Color.BLACK);
		 d.removeDrawable(obj);
		 assertSame("DrawableObjectList did not initialize size of list correctly",0,d.getSize());
	 }


}
