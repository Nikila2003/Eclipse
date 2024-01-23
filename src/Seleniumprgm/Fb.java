package Seleniumprgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
		String s1="YouTube";
		System.out.println(s.equals(s1));
		if(s.equals(s1))
		{
			
			System.out.println("Success");
		}
		else
		{
            System.out.println("Error");
//functrionality test cheyan , regression testing 
            //selenium has 4 component
            
		}
	}
}



