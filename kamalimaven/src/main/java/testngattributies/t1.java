package testngattributies;

import org.testng.annotations.Test;



public class t1 {
	//test ng: test next generation
		//testing framework
		// Annotations, attributes, assertion, waits, report generation
		// Inspired from JUNIT
		//test cases
		//      non static
		//      @Test
		//      default order: alphabetical order 
		
		//priority :  arrange the test case in particular order
		//description: add short note on test case 
		//groups
		//invocation count:run same test case for multiple time 
		//enabled=false 
		//timeout
	
	
	@Test(priority=0,description="cat",groups="L",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="apple",groups="o")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="xxx",groups="P",enabled=false)
	public void m2()
	{
		System.out.println("Test case 3");
	}
}
