package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {

	@Test
	public void soft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		SoftAssert s= new SoftAssert();
		s.assertEquals(ob.getTitle(), "yahoo");//fail
		s.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		s.assertAll();	
	}
}
