package testngpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		
	}
  @Test
  public void main() throws Exception
  {
	  driver.get("https://www.ilovepdf.com/word_to_pdf");
	  driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("C:\\Users\\user\\OneDrive\\Documents\\Luminar\\Autoit\\autoit-v3-setup\\s1.exe");
	  Thread.sleep(3000);
  }
}
