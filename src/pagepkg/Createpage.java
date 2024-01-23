package pagepkg;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage 
{
	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
    WebElement createpage;
    @FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
    WebElement title;
    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
    WebElement getstarted;
    
    public void cretepageclick()
    {
    	createpage.click();
    }

     public void titleverification()
    {
    	 if(title.isDisplayed())
    	 {
    		 System.out.println("the text is displayed");
    	 }
    }
    
    public void getstartedclick()
    {
    	getstarted.click();
    }
    
    public Createpage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
}
