package testngattributies;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t4 {
	ChromeDriver ob;
    
	@Test(priority=0,description="visting the website",groups="p")
	public void visting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ob= new ChromeDriver();
	    ob.get("http://www.mycontactform.com");
    }
	
	@Test(priority=1,description="visting the website")
	public void help () throws InterruptedException 
	{
		ob.findElementByLinkText("Help").click();
		Thread.sleep(3000);
		ob.quit();
	}

	
	}
