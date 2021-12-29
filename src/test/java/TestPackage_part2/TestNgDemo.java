package TestPackage_part2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestPackage.TestNgAnnotation;
import junit.framework.Assert;

public class TestNgDemo {

	SoftAssert softassert=new SoftAssert();
	/*@BeforeSuite
	public void Beforesuite(){
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");

	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}*/
	
	@Test(priority=1,enabled=true,groups={"child"})
	public void mayur(){
		System.out.println("This is mayur");
	}
	
	@Test(priority=2,enabled=true,groups={"parent"})
	public void vinayak(){
		System.out.println("This is vinayak");
	}
	
	@Test(priority=3,enabled=true,groups={"parent"},dataProvider="getData",dataProviderClass=TestNgAnnotation.class)
	public void khakre(String name1,String name2){
		System.out.println("This is khakre");
		System.out.println(name1+" "+name2);
	}
	
	
	
	@Test(enabled=false)
	public void test4(){
		String one="ashish";
		
	}
	
	@Test(enabled=false)
	public void test5(){
		
		
		
	}
	
	
}
