package testngpackage;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@BeforeTest (alwaysRun = true)//will be executing first
	public void setUp()
	{
		System.out.println("browser open");
	}
	@BeforeMethod (alwaysRun = true)//will be executing after each test 
	public void urlloading()
	{
		System.out.println("url details");
	}
	@Test(priority = 3 , groups = {"smoke"})
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 1 , groups = {"sanity"})
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority = 2 , groups = {"smoke"})
	public void test3()
	{
		System.out.println("test 3");
	}
	@AfterMethod // will be executing after each method
	public void aftmethd()
	{
		System.out.println("after method details ");
	}
	@AfterTest //will be executing at the end 
	public void quit()
	{
		System.out.println("browser quit");
	}
}