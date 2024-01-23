package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotfileupload //robot is used to handle mouse or key event in java
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
	driver=new ChromeDriver();
	}
	
	@Test
	public void fileuploadprgm() throws Exception
	{
	driver.get("https://www.ilovepdf.com/word_to_pdf");	
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	
	fileUpload("C:\\Users\\user\\Downloads\\Certificates\\nikila cv doc 2mb.docx");
	}

	private void fileUpload(String p) throws AWTException 
	{
		StringSelection strSelection=new StringSelection(p);//url  copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
