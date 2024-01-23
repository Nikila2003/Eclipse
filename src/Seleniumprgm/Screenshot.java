package Seleniumprgm;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	 ChromeDriver driver;

		@Before
		public void before()
		{
	       driver = new ChromeDriver();
		}
		@Test
		public void test() throws Exception
		{
			driver.get("file:///C:/Users/user/OneDrive/Documents/Luminar/alertbox.html");
			//File s=((TakeScreenshot)driver).getScreenshotAs(OUTPUT.FILE);
			//FileHandler.copy(s, new File("E://screenshot.png"));
			
			WebElement button=driver.findElement(By.xpath("//*[@name='firstname']"));
			File s2=button.getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(s, new File("./Screenshot/firstname.png"));
			
}
		}
