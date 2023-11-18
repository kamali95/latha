package testngannotion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class realtime {
	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
	   System.out.println("test case 1: title "+ ob.getTitle());
	}
	@Test(priority=1)
	public void t2()
	{
	    System.out.println("test case 2: clicking ");
	    ob.findElementByLinkText("Privacy").click();
	}
	    @BeforeTest
	public void bt()
	{
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
	        ob= new ChromeDriver();
	        ob.get("http://www.google.com");
	        System.out.println("before test -visiting webste");
	}
	    @AfterTest
	public void at() throws InterruptedException
	{
	    Thread.sleep(2000);
	     System.out.println("after test- closing ");
	ob.quit();
	}
	   
	   
	 @BeforeClass
	 public void btc()
	    {
	    System.out.println("before class : maximising ");
	    ob.manage().window().maximize();
	    }
	 @AfterClass
	 public void atc()
	    {
	    System.out.println("after class: url "+ ob.getCurrentUrl());
	    }
	       
	 @BeforeMethod
	 public void btm()
	    {
	    System.out.println("before method- refreshing ");
	    ob.navigate().refresh();
	    }
	  @AfterMethod
	  public void atm()
	    {
	    System.out.println("after method - deleting cookies ");
	    ob.manage().deleteAllCookies();
	    }
	}

