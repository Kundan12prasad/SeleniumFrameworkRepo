package listenersmoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSmoke {
	
	@Test
	public void testMethod01_smoke() {
		System.out.println("Hello World 01_smoke!!!");
		Assert.assertEquals(2, 3);
	}	
	
	@Test
	public void testMethod02_smoke() {
		System.out.println("Hello World 02_smoke!!!");
		Assert.assertEquals(2, 2);
	}

}
