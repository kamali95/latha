package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		//method1: page up and page down
		
		 ob.executeScript("window.scrollBy(0, document.body.scrollHeight)");//down
		
		    Thread.sleep(3000);
		     ob.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		     Thread.sleep(3000);
		
		
		//method 2:page up and pages down
		
        ob.executeScript("window.scrollBy(0, 1000)");//down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(3000);
		ob.quit();

	}

}
