package abc;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day3 { 
	@BeforeSuite
	public void apilogin()
	{
		System.out.println("belong to day3 api login method");
	}
	@AfterSuite
	public void apilogout()
	{
		System.out.println("belong to day3 api logout method");
	}
	@Test
	public void data()
	{
		System.out.println("belong to day3 data method");
	}
	@Test(enabled=false)
	public void exel()
	{
		System.out.println("belong to day3 exel method");
	}
	@Test
	public void word()
	{
		System.out.println("belong to day3 word method");
	}
	@Test(groups= {"socialsite"})
	public void hike()
	{
		System.out.println("belong to day3 hike method");
	}
	
	
	

}
