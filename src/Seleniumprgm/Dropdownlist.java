package Seleniumprgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

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
		 //driver.findElement(By.xpath("//*[contains(@name,'name0')]")).sendKeys("Nikila");
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 WebElement date=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		 Select ob= new Select(date);
		 ob.selectByValue("03");
		 List<WebElement> Count = ob.getOptions();
		 System.out.println("Number of items: " + Count.size());
		 
		 WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		 Select ob1= new Select(month);
		 ob1.selectByVisibleText("JUN");
		 List<WebElement> Count1 = ob.getOptions();
		 System.out.println("Number of items: " + Count1.size());
		 
		 WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		 Select ob2= new Select(year);
		 ob2.selectByVisibleText("2003");
		 
		 
		 
		 
	 }
}
