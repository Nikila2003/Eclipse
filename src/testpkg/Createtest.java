package testpkg;

import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;

public class Createtest 
{
	public static WebDriver driver;//loading the url
	@BeforeTest
	public void beforetest()//loading the browser
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testcreate()
	{
	
Createpage ob=new Createpage(driver);
ob.cretepageclick();
ob.titleverification();
ob.getstartedclick();


	}

}
