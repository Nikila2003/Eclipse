package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Healthpage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement health;
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement dropdwn;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement enq;
	@FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement values;
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement send;
	
	public void healthsetup()
	{
		health.click();
	}
	
	public void az()
	{
		
		 Select ob= new Select(dropdwn);
		 ob.selectByValue("alphabet-asc");

	}
	public void enqclick()
	{
		enq.click();
	}
    public void valuesenq(String val)
    {
    	values.sendKeys(val);
    }
	public void click()
	{
	    send.click();
	}
	
	public Healthpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
























