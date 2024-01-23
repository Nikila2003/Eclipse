package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest 
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
	public void testlogin()//refering the values entered
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("nikila", "nikila2222");
		ob.login();
		driver.navigate().back();//runs in two diffrent windows
	}

}
