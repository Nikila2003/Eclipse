package Seleniumprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay
{
	ChromeDriver driver;
@Before
public void before()
{
driver = new ChromeDriver();
driver.manage().window().maximize();
}
@Test
public void test()

{
	driver.get("https://www.ebay.com/");
	String titile=driver.getTitle();
	System.out.println(titile);
	String title1="Ebay.com";
	if(titile.equals(title1))
	{
    System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
   driver.findElement(By.xpath("//*[@id='gh-shop-a']")).click();
   driver.findElement(By.xpath("//ul/li[4]/a[@class='scnd']")).click(); 
   String s="Shop by Category";
   if(driver.getPageSource().contains(s))
   {
   System.out.println(s+" is present");
   }
   else
   {
	   System.out.println(s+" is'nt present");
   }
    driver.findElement(By.xpath("//section[1]/div[2]/span[1]/a[1]/div[2][@class='b-visualnav__title']")).click();
    driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();
    driver.findElement(By.xpath("//*[@data-test-id='start-shopping']")).click();
    driver.findElement(By.xpath("//*[@aria-autocomplete='list']")).sendKeys("books",Keys.ENTER);
    
   
}

}
