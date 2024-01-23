package testpkg;

import org.testng.annotations.Test;

import pagepkg.Herballogin;

public class Logintest extends Baseherbalclass
{

	@Test
	public void herbaltest()
	{
		Herballogin ob= new Herballogin(driver);
		ob.login();
		ob.setup("nikilaponnuz@gmail.com", "Midhila_2018");
		ob.signin();
	}
}
