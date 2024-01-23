package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herballogin
{
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/span")
	WebElement myacc;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login;
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement hemail;
	@FindBy (xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement hpswd;
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
    WebElement button;
	
	
	public void login()
	{
		myacc.click();
		login.click();
	}
	
	public void setup(String email,String pswd)
	{
	 hemail.sendKeys(email);
	 hpswd.sendKeys(pswd);
	}
	public void signin()
	{
		button.click();
	}
	public Herballogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}










