package testpkg;

import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseherbalclass
{
public static WebDriver driver;
	
	@BeforeTest
	public void beforetest()//loading the browser
	{
		driver = new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
