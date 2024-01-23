   package Seleniumprgm;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnameprgm
{
//findelement returns specific webelement
//findelements returns list of webelement
	
	ChromeDriver driver;
	
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/");
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links is "+ linkdetails.size());
		
	

		 for(WebElement link:linkdetails)//Extract links
		 {
			 System.out.println(link.getText() + "=" + link.getAttribute("href"));
			 }
		 driver.quit();
	}
}

//getText= to get the text of the link
//getAttribute= to get the value of the link

























