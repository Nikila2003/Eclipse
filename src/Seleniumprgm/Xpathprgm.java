package Seleniumprgm;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver =new ChromeDriver();
	
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//*[@name='email']")).sendKeys("nikila@gmail.com");
	    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("bdsyw_037");
	    driver.findElement(By.xpath("//*[@name='login']")).click();
	  
	}
	

}

 