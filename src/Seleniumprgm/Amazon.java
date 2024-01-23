package Seleniumprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
ChromeDriver driver;

@Before
public void before()
{
	driver =new ChromeDriver();
}
@Test
public void test() throws Exception
{
	driver.get("https://www.amazon.in");

	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@id='nav-cart-count-container']")).click();
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']")).click();
	}

}
//xpath
/*amazon.in open
* enter mobiles in search feild
* search button click
* click cart
* click on books
* select english
* */

/* xpath using contains
 * //*[contains(@type,'sub')]
 *//*[contains(text(),'here')]-text must not be mentioned with @ it must be mentioned with () function
 *//*[contains(@name,'btn')]
 *//*[@type='submit' or @name='bdsam']*/
 