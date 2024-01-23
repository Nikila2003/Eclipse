package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreportprgm 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "window11");
		extent.setSystemInfo("Testername", "nikila");
		extent.setSystemInfo("Browsername", "chrome");
		driver=new ChromeDriver();
		
	}
		@BeforeMethod
		public void setup()
		{
			driver.get(baseurl);
		}
		
		@Test
		public void fbtitleverification()
		{
			test=extent.createTest("Fbtitleverification");
			String Exp="facebook";
			String actual=driver.getTitle();
			Assert.assertEquals(Exp, actual);
		}
		
		@Test
		public void fblogotest()
		{
			test=extent.createTest("Fblogotest");
			boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
			Assert.assertTrue(b);
		}
		@AfterMethod
		public void browserclose(ITestResult result)
		{
        if(result.getStatus()==ITestResult.FAILURE)
        {
        	test.log(Status.FAIL,"test case failed is"+result.getName());
        	test.log(Status.FAIL,"test case failed is"+result.getThrowable());
        //	String screenshotpath=screenshotMethod(driver,result.getName());
        //	test.addScreenCaptureFromPath(screenshotpath);
        }
        else if(result.getStatus()==ITestResult.SKIP)
        {
        	test.log(Status.SKIP,"test case skipped is "+result.getName());
        	
        }
        else if(result.getStatus()==ITestResult.SUCCESS)
        {
        	test.log(Status.PASS,"test case passed is"+result.getName());
        }
        }
        
       @AfterTest
       public void teardown()
       {
    	   extent.flush();
       }
		}
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		