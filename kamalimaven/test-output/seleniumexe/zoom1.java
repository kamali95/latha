package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoom1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		//greater than 100=>zoom in
		//normal :100
		//less than 100->zoom out
		
		ob.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='20%'");
		Thread.sleep(3000);
		ob.quit();
		
		
		
		
	}

}
