package invocationcount;

import org.testng.annotations.Test;

public class InvocationClass01 
{
	@Test(invocationCount=6, threadPoolSize=3 )
	public void Test01() {		
		System.out.println("I am in Test01 - Thread ID = " + Thread.currentThread().getId() );			
	}

}
