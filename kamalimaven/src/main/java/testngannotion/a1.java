package testngannotion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {

	//before test:   run only once before all the test cases started its execution
	// after test:   run only once after all the test cases finished its execution

	//before class: run only once after before test
	//after class:  run only once before after test

	//before method: run before each test case
	// after method: run after each test case

	// before test
	// before class
	// before method : tc1 :  after method
    //before method :tc2 :  after method
    //after class
	//after test

	@Test(priority=0)
	public void t1()
	{
	System.out.println("test case 1");
	}
	@Test(priority=1)
	public void t2()
	{
	System.out.println("test case 2");
	}
	    @BeforeTest
	public void bt()
	{
	System.out.println("before test ");
	}
	    @AfterTest
	public void at()
	{
	System.out.println("after test ");
	}
	   
	   
	    @BeforeClass
	    public void btc()
	    {
	    System.out.println("before class ");
	    }
	       @AfterClass
	    public void atc()
	    {
	    System.out.println("after class ");
	    }
	       
	       @BeforeMethod
	    public void btm()
	    {
	    System.out.println("before method ");
	    }
	       @AfterMethod
	    public void atm()
	    {
	    System.out.println("after method ");
	    }

	}
