package Seleniumprgm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemoprgm
{
   ChromeDriver driver;
   
   @Before
   public void setUp()
   {
   driver=new ChromeDriver();
   driver.get("http://www.google.com");
   
   }
   
   @Test
   public void titileVerification()
   {
	   String title=driver.getTitle();
	   System.out.println(title);
   }
   @Test
   public void pagesrc()
   {
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("present");
}
else
{
	System.out.println("not present");
	}
}
   
    @After
		public void tearDown()
		{
			driver.quit();
		}
	}


