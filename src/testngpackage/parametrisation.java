package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrisation {
	
	@Parameters({"n"})
	@Test
	public void main(String n)
	{
		System.out.println("value="+n);
	}

}
