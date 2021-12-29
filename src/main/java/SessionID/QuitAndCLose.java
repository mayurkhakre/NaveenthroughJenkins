package SessionID;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitAndCLose 
{
	
	
    public static void main( String[] args ) throws Exception
    {
     // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
     /* System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    //	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        By forgotPass= By.partialLinkText("Forgotten password"); 
        driver.findElement(forgotPass).click();
        Actions act =new  Actions(driver);
      File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(srcFile,new File(".//screenshot/katriina.png"));
        // <a href="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM3NDgzNjU2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login">Forgotten password?</a>
   WebDriverWait wait= new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.titleContains("title"));
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
   /*Map<String, String> userMap=new HashMap<String, String>();
   userMap.put("Katrina", "Kaif");
   userMap.put("Dimple", "Suryavanshi");
   userMap.put("Nakshatra", "Maurya");
   userMap.put("Anjali", "Patil");
   userMap.put("Indira", "Pratap");
   
  for(Map.Entry<String,String> val: userMap.entrySet()){
	  System.out.println(val.getKey()+"  "+val.getValue());*/
	  
	  Hashtable<String, String>ht= new Hashtable<String, String>();
	  ht.put("mk", "12");
	  ht.put("yu", "null");
	 // ht.put("mk",null);
	  ht.put("rt", null);
	  
	  for(Map.Entry<String,String> table: ht.entrySet()){
		  System.out.println(table.getKey()+"  "+table.getValue());
  }
   
   
   
    }
    
    public void instanceMethod(){
    	
    	
    	
    }
}
