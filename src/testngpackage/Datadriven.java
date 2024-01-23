package testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com/");
		
		FileInputStream fi= new FileInputStream("C:\\Users\\user\\Downloads\\Untitled spreadsheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet s=wb.getSheet("Sheet1");
		int RowCount= s.getLastRowNum();
		
		for(int i=1;i<=RowCount;i++)
		{
			String username =s.getRow(i).getCell(0).getStringCellValue();
			String pwd =s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username+"\n"+"password="+pwd);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			
		}
		
	}

}
