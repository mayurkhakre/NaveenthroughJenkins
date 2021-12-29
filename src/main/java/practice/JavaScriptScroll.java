package practice;

import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Interface.Base;

public class JavaScriptScroll extends Base {

	static WebDriver driver;	
	static JavaScriptScroll jsp;
	By clickOn650More= By.cssSelector("div[class='brand-more']");
	By horiScroll=By.cssSelector("ul[class='FilterDirectory-list']");
	By clickOnAll=By.cssSelector("i[class='hm-icon nav-sprite']");
	
	public WebElement returnWebElementFromBy(WebDriver driver,By locator){
		return driver.findElement(locator);
	}
	
	
	public  void maximizeWindow(WebDriver driver){
		driver.manage().window().maximize();
	}
	
 public  void jsScrollThePageVerticalByPixels(WebDriver driver,int pixel){
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,"+pixel+")", " ");
	}
 
 public  void jsScrollHorizontallyInsideDivByPixels(WebDriver driver,int pixel,String queryCss){
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("document.querySelector('"+queryCss+"').scrollLeft="+pixel+"");
	}
 
 public  void jsScrollVerticallyInsideDivByPixels(WebDriver driver,int pixel,String queryCss){
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("document.querySelector('"+queryCss+"').scrollTop="+pixel+"");
	}
 
  public void scrollHorizontal(WebDriver driver) throws Exception{
		returnWebElementFromBy(driver, clickOn650More).click();
		jsScrollThePageVerticalByPixels(driver, 200);
	
 }
   
 public static void main(String[] args) throws Exception {
	  driver=Base.initializeDriver(driver);
	  driver.get("https://www.myntra.com/shirts");
	   jsp=new JavaScriptScroll();
	  jsp.maximizeWindow(driver);
	  jsp.jsScrollThePageVerticalByPixels(driver, 500);
	  jsp.scrollHorizontal(driver);
}
}
