package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	
	private Rectangle r;
	
	 @Before
	    public void setUp() throws Exception {
	        /*
	         * Construct all of the objects being used in the test fixture here.
	         */;
		r = new Rectangle (0,0,3,4,Color.GREEN);
		 
	     }
	 @Test
	 public void testRectangle()
	 {
		 assertEquals("x-coordinate incorrectly initialized",0,r.getX());
		 assertEquals("y-coordinate incorrectly initialized",0,r.getY());
		 assertEquals("Width incorrectly initialized",3,r.getWidth());
		 assertEquals("Length incorrectly initialized",4,r.getLength());
		 assertSame("Color incorrectly initialized",Color.GREEN,r.getColor());
	 }
	 @Test
	    public void testSetColor() {
	        r.setColor(Color.BLUE);
	        assertEquals("setColor() did not correctly set the color", Color.BLUE, r.getColor());     
	    }
	 @Test
	    public void testSetVisible() {
	        r.setVisible(false);
	        assertFalse("Rectangle was not made invisible", r.isVisible());
	        
	        r.setVisible(true);
	        assertTrue("Rectangle was not made visible", r.isVisible());
	    }
	 @Test
	 public void testSetWidth()
	 {
		 r.setWidth(2);
		 assertEquals("Width was not properly changed",2,r.getWidth());
	 }
	 @Test
	 public void testSetLength()
	 {
		 r.setLength(5);
		 assertEquals("Length was not properly changed",5,r.getLength());
	 }
	 @Test
	 public void testScale()
	 {
		
		 r.scale(2);
		 assertEquals("Width was not properly scaled",6,r.getWidth());
		 assertEquals("Length was not properly scaled",8,r.getLength());
	 }
	   @Test
	    public void testMove() {
	        r.move(20,30);
	        assertEquals("X was not moved properly", 20, r.getX());
	        assertEquals("Y was not moved properly", 30, r.getY());
	    }
	    
	    @Test
	    public void testTranslate() {
	        r.translate(5,10);
	        assertEquals("X was not translated properly", 5, r.getX());
	        assertEquals("Y was not translated properly", 10, r.getY());
	    }

}
