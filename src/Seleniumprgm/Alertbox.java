package Seleniumprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

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
			driver.findElement(By.xpath("//*[@value='Display alert box']")).click();
			Alert a=driver.switchTo().alert();//method 
			String alerttext=a.getText();//to get the alert text
			a.accept();//accept the alert box
			System.out.println("alert text="+alerttext);
			//a.dismiss()-for canceling alert
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Nikila");
			driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sunil");
			driver.findElement(By.xpath("//*[@value='Submit']")).click();


	}

}
