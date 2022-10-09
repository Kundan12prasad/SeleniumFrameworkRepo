package listenerregression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoregression {
	@Test
	public void testMethod01_reg() {
		System.out.println("Hello World 01_reg!!!");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod02_reg() {
		System.out.println("Hello World 02_reg!!!");
		Assert.assertEquals(2, 2);
	}
	

}
