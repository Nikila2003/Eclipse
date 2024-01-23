package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage 
{
	WebDriver driver;
	
//	By fbemail=By.xpath("//*[@id=\"email\"]");//locating the webelement
//	By fbpswd=By.xpath("//*[@id=\"pass\"]");
//	By fblogin=By.name("login");
	@FindBy(id="email")
	WebElement fbemail;
	@FindBy(id="pass")
	WebElement fbpswd;
	@FindBy(name="login")
    WebElement fblogin;
	
	
	public void setvalues(String email,String pswd)//to enter values using parameterization
	{
//		driver.findElement(fbemail).sendKeys(email);
//		driver.findElement(fbpswd).sendKeys(pswd);
		fbemail.sendKeys(email);
		fbpswd.sendKeys(pswd);
	}
	
	public void login()//to click the button
	{
//		driver.findElement(fblogin).click();
		fblogin.click();
		
	}
	
	public Fbloginpage(WebDriver driver)//to load the webdriver
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}

