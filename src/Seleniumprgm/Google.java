package Seleniumprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
ChromeDriver driver;

@Before
public void before()
{
driver=new ChromeDriver();
driver.manage().window().maximize();//to maximize the window
}

@Test
public void test()
{
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@type='search']")).sendKeys("books",Keys.ENTER);//keys.ENTER is used to enter directly 
	//driver.findElement(By.xpath("//*[@value='Google Search']")).click();//ElementNotInteractableException
	}
}
