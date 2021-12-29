package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Interface.Base;

// http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html
// https://www.tripodeal.com/flight-deal?utm_source=bing_tpk&utm_medium=cpc&utm_campaign=bing_tpk&msclkid=34fa6266dd021eb0952103c66c53ce42
public class CalenderHandling extends Base {
 
	
	static WebDriver driver;
	By getTextOCurrentfMonth=By.cssSelector("div[id='dateNew_root'] div[class='picker__month']");
	By getTextOCurrentYear=By.cssSelector("div[id='dateNew_root'] div[class='picker__year']");
	By clickOnCalender=By.cssSelector("input[id=dateNew]");
	By clickOnNextArrow=By.cssSelector("div[id='dateNew_root'] div[class='picker__nav--next']");
	By getDate=By.cssSelector("table[id='dateNew_table'] tbody tr td div");
	By clickOnDate;
	static CalenderHandling cd;
	
	public void select_month_year(String month,String year,WebDriver driver){
		try {
			cd=new CalenderHandling();
			while(true){
				 Thread.sleep(3000);
				if(cd.returnWebElement(getTextOCurrentYear,driver).getText().equalsIgnoreCase(year)){
					 Thread.sleep(3000);
					if(cd.returnWebElement(getTextOCurrentfMonth,driver).getText().contains(month)){
						break;
					}
					else{
						 Thread.sleep(3000);
						cd.returnWebElement(clickOnNextArrow,driver).click();
					}
				}
				else{
					 Thread.sleep(3000);
					cd.returnWebElement(clickOnNextArrow,driver).click();
				}
				
			}
		} catch (Exception e) {
			System.out.println("Yu have entered incorrect date");
			e.printStackTrace();
		}
		
		
	}
	
   public WebElement returnWebElement(By locator,WebDriver driver){
		return driver.findElement(locator);
	}
   
   public List<WebElement> returnWebElements(By locator){
		return driver.findElements(locator);
	}
	
  public void select_date_and_click(String date,WebDriver driver) throws Exception{
	 cd=new CalenderHandling();
	 cd.returnWebElement(clickOnCalender, driver).click();
	String[] monthYear=date.split("-");
	cd.select_month_year(monthYear[1],monthYear[2],driver);
	for(int i=0;i<cd.returnWebElements(getDate).size();i++){
		String currentDate=cd.returnWebElements(getDate).get(i).getText();
		if(currentDate.equals(monthYear[0])){
			 Thread.sleep(3000);
			cd.returnWebElements(getDate).get(i).click();
			break;
		}
	}
		
	}
	public static void main(String[] args) throws Exception{
		driver=Base.initializeDriver(driver);
		cd=new CalenderHandling();
		 driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing_tpk&utm_medium=cpc&utm_campaign=bing_tpk&msclkid=34fa6266dd021eb0952103c66c53ce42");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 cd.select_date_and_click("11-March-2022",driver);
	}
	
}
