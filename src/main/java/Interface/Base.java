package Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	WebDriver driver;

	
	
	public static WebDriver initializeDriver(WebDriver driver){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	
	
}
