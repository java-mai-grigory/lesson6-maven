package mai.lesson_6.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import mai.mathlib.MyMath;

class Test {
	
	@org.junit.jupiter.api.Test
	  public void testExp() {
	    	assertEquals( 2.71, MyMath.exp(1), 0.01);
	  }
	
	@org.junit.jupiter.api.Test
	  public void testCos() {
	    	assertEquals( -1, MyMath.сos(Math.PI), 0.01);
	  }
	
	@org.junit.jupiter.api.Test
	  public void testCos2() {
	    	assertEquals( Math.sqrt(2) / 2, MyMath.сos(Math.PI / 4), 0.01);
	  }
	
	@org.junit.jupiter.api.Test
	  public void testCos3() {
	    	assertEquals( 1, MyMath.сos(0), 0.01);
	  }


}
