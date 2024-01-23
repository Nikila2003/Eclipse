package Seleniumprgm;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsprgm {
	ChromeDriver driver;
	String s="http://www.facebook.com";

	
	@Before
   public void setUp()
   {
	   driver=new ChromeDriver();
	   driver.get(s);
   }
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("nikila@gmail.com");//id
		driver.findElement(By.name("pass")).sendKeys("563_uab");//name
		driver.findElement(By.name("login")).click();
	}
}
