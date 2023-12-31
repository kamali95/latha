package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testnglistener.l1.class)
public class a1 {
	/*assertion: technique where we will be comparing actual result with obtained result
	 * 
	 * hard:
	 *     provided by assert built- in class
	 *     static in nature 
	 *     if assertion fails, it wont proceed further
	 *     
	 * soft 
	 *    provided by soft assert built-in class
	 *    non static in nature
	 *    fail=> it will proceed further
	 *    invoke assertAll()
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * */
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
	
	@Test
	public void hard2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		Assert.assertEquals(ob.getTitle(), "Google");
		WebElement ele = ob.findElementByLinkText("About");
		Thread.sleep(2000);
		ob.quit();
	      
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
