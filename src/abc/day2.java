package abc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class day2 {
	@BeforeClass
	public void Weblogin()
	{
		System.out.println("belong to day2 method name Web login");
	}
	@AfterClass
	public void Weblogout()
	{
		System.out.println("belong to day2 method name Web logout");
	}
	@Test(groups= {"socialsite"})
	public void Webwhatsapp()
	{
		System.out.println("belong to day2 method name Web whatsapp");
	}
	@Test(groups= {"socialsite"})
	public void Webfacebook()
	{
		System.out.println("belong to day2 method name Web facebook");
	}
	

}
