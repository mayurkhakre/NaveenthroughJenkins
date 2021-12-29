package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Interface.Base;

public class WindowHandles extends Base{

	static WebDriver driver;
	static WindowHandles wd;
	String parentId=null;
	String childId=null;
	Scanner sc;
	static By sbisalaryAccount=By.partialLinkText("Salary Account");
	static By linkPanWIthAadhar=By.partialLinkText("Linking of PAN");
	static By doorstepBanking=By.partialLinkText("Doorstep Banking");
	static By clickOnCorporateInstitution=By.xpath("//a[contains(text(),'Corporate/Institutions')]");
	static By clickOnUsername=By.cssSelector("input[id='username']");
	static By myLearning=By.xpath("(//span[text()='My learning'])[1]");
	static By clickOnpavan=By.xpath("//strong[text()='Learn API & Microservices Testing']");
	
	public static void main(String[] args) {
		driver=Base.initializeDriver(driver);
		wd=new WindowHandles();
		wd.preRequisites(driver);
		//driver.get("https://www.onlinesbi.com/");
		driver.navigate().to("https://www.udemy.com/");
		/*wd.returnWebElement(driver, sbisalaryAccount).click();
		System.out.println(driver.getTitle());
		wd.getWindowId(driver);
		System.out.println(driver.getTitle());
		wd.returnWebElement(driver, clickOnCorporateInstitution).click();
		*/
		wd.returnWebElement(driver, myLearning).click();
		wd.returnWebElement(driver, clickOnpavan).click();
	}
	
	public void preRequisites(WebDriver driver){
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public WebElement returnWebElement(WebDriver driver,By locator){
		return driver.findElement(locator);	
	}
	
	public static Scanner ScannerInput(WebDriver driver){
		return new Scanner(System.in);
	}
	
	public void getWindowId(WebDriver driver){
		System.out.println("Press 1 to switch to Parent window");
		System.out.println("Press 2 to switch to Child window");
		int window=WindowHandles.ScannerInput(driver).nextInt();
		String returnWindowId=null;
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iteratorHandle=handles.iterator();
		parentId=iteratorHandle.next();
		childId=iteratorHandle.next();
		switch(window)
		{
		case 1:
			returnWindowId= parentId;
			break;
			
		case 2:
			returnWindowId= childId;
			break;
		default :
			System.out.println("Enter correct optopn");
			break;
		}
	
		wd.switchToWindow(driver, returnWindowId);
	}
	
	public void switchToWindow(WebDriver driver,String windowId){
		driver.switchTo().window(windowId);
	}
}
