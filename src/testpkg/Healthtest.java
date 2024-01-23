package testpkg;

import org.testng.annotations.Test;

import pagepkg.Healthpage;

public class Healthtest extends Baseherbalclass
{
@Test
public void healthpagetest() throws InterruptedException
{
Healthpage ob=new Healthpage(driver);
Thread.sleep(3000);
ob.healthsetup();
ob.az();
ob.enqclick();
ob.valuesenq("testing herbal india");
ob.click();
}
}