package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
    @Test
    public void run()
    {
    	Actions act=new Actions(driver);
    	
    	WebElement rightclickbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
    	act.contextClick(rightclickbutton);
    	act.perform();
    	
    	WebElement editbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
    	editbutton.click();
    	
    	Alert a=driver.switchTo().alert();
    	String alerttext=a.getText();
    	System.out.println(alerttext);
    	a.accept();
    	
    	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
    	act.doubleClick();
    	
    }
}
