package testngattributies;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t3 {
     ChromeDriver ob;
     
	@Test(priority=0,description="visting the website",groups="p")
	public void visting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ob= new ChromeDriver();
	    ob.get("http://www.facebook.com");
    }
	
	@Test(priority=1,description="enter the phone numbers",groups="p")
	public void details ()
	{
		ob.findElementByXPath("//*[@id=\"email\"]").sendKeys("9786316085");
	}
	@Test(priority=2,description="enter the password",groups="p")
	public void password()
	{
		ob.findElementByXPath("//*[@type='password']").sendKeys("12354");
	}
	
	@Test(priority=3,description="click the login button ",groups="p",enabled=false)
	public void login()
	{
		ob.findElementByXPath("//*[@id=\"u_0_5_EV\"]").click();
		ob.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
