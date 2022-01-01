package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestNgAnnotation2 {

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
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("You are running a Regression test");
	}
	@Test(priority=1,enabled=true,groups={"other"})
	public void test(){
		System.out.println("This is test");
	}
	
	@Test(priority=2,enabled=true,groups={"other"})
	public void test2(){
		System.out.println("This is test2");
	}
	
	@Test(priority=3,enabled=true,groups={"other"})
	public void test3(){
		System.out.println("This is test3");
	}
	
	@Test(priority=3,enabled=false,groups={"other","parent"},timeOut=40000,dataProvider="getData")
	public void testOfAshish(String name,String name2){
		System.out.println(name);
		System.out.println(name2);
		System.out.println("This is ashish");
	}
	
	
	@DataProvider
	public Object[] getData(){
		Object [][] data=new Object[2][2];
		data[0][0]="katrina";
		data[0][1]="Dimple";
		data[1][0]="nakshatra";
		data[1][1]="twinkle";
		return data;
	}
	
	@Test(enabled=false)
	public void test4(){
		String one="ashish";
		String two="Mayur";
		System.out.println("before hard assert 1");
		softassert.assertEquals("Result not matched","good", "good");
		System.out.println("before hard assert 2");
		softassert.assertEquals("Result not matched",one, two);
		System.out.println("before hard assert 3");
		softassert.assertEquals("Result not matched","best", "best");
		System.out.println("after hard assert 3");
		softassert.assertAll();
	}
	
	@Test(enabled=false)
	public void test5(){
		System.out.println("This is test5");
		String one="ashish";
		String two="Mayur";
		System.out.println("before hard assert 1");
		Assert.assertEquals("Result not matched","good", "good");
		System.out.println("before hard assert 2");
		Assert.assertEquals("Result not matched",one, two);
		System.out.println("before hard assert 3");
		Assert.assertEquals("Result not matched","best", "best");
		System.out.println("after hard assert 3");
		
		
	}
	
	
}
