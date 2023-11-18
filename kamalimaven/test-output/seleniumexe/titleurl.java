package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class titleurl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\KANNADAASAN\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		ob.quit();
		
		
		
		
	}
	
	
	

}
