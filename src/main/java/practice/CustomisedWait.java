package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomisedWait {

	WebDriver driver;
	
	public CustomisedWait(WebDriver driver)
	{
		
		this.driver=driver;
	}	
	
	public static WebElement getElementWithWait(WebDriver driver,By locator,int timeout){
		
		WebElement element=null;
		
		for(int i=0;i<timeout;i++)
		{
			try 
			{
				element=driver.findElement(locator);
				break;
		     } 
			catch (Exception e) 
			{
				try
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e2)
				{
					
				}
			}
		
		}
		
		return element;
	}
}
