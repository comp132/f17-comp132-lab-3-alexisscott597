package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics;

import org.junit.Before;
import org.junit.Test;


public class LineTest {
	
	private Line myLine;
	
	@Before
    public void setUp() throws Exception {
        /*
         * Construct all of the objects being used in the test fixture here.
         */;
	myLine = new Line (0,0,3,4,Color.GREEN);
	 
     }
	
	@Test
	public void testLine()
	{
		assertEquals("x1 not initialized correctly",0,myLine.getx1());
		assertEquals("x2 not initialized correctly",0,myLine.getx2());
		assertEquals("y1 not initialized correctly",3,myLine.gety1());
		assertEquals("y2 not initialized correctly",4,myLine.gety2());
		assertSame("Color did not initialze correctly",Color.GREEN,myLine.getColor());
	}
	
	 @Test
	    public void testSetColor() {
	        myLine.setColor(Color.BLUE);
	        assertEquals("setColor() did not correctly set the color", Color.GREEN, myLine.getColor());     
	    }
	 
	 @Test
	    public void testSetVisible() {
	        myLine.setVisible(false);
	        assertFalse("Rectangle was not made invisible", myLine.isVisible());
	        
	        myLine.setVisible(true);
	        assertTrue("Rectangle was not made visible", myLine.isVisible());
	    }

}
