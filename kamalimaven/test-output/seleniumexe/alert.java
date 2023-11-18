package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//alert:message ,pop-up
       // ob.executeScript("alert('quick')");
        ob.executeScript("window.confirm('quick')");
        
        Thread.sleep(3000);
        //switch our control to the alert
         Alert al = ob.switchTo().alert();
        al.accept();
        ob.quit();
	}

}
