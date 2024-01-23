package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebook {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void urlloading()
    {
    	driver.get("https://www.facebook.com/");
    }
    @Parameters({"e","p"})
    @Test
    public void main(String e,String p)
    {
    	System.out.println(e);
    	System.out.println(p);
    	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(e);
    	driver.findElement(By.xpath("//*[@name='pass']")).sendKeys(p);
    	driver.findElement(By.xpath("//*[@name='login']")).click();
    	}
    @AfterMethod
    public void mrthd()
    {
    	System.out.println("Success");
    }
    @AfterTest
    public void quit()
    {
    	driver.quit();
    }
}
