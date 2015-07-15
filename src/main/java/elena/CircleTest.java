package elena;

import static org.junit.Assert.*;
import java.math.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {
	
	private Circle c1;
	private Circle c2;
	private Circle c3;
	
	

   @Test  
   public void equalCircle() throws RazaNegativaException {
	   
	     c1 = new Circle(1, 2, 3, 4);
	     c2 = new Circle(1, 2, 3, 4);
	     assertEquals(c1, c2);	    
   }
   
@SuppressWarnings("deprecation")
@Test 
   public void areaEqualsPi() throws RazaNegativaException {
	   
	   c3 = new Circle(1,1,1,1);
	  
	   assertEquals(Math.PI, c3.getArie(), 0.001);
   }
	
}
