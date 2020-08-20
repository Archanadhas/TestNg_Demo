package abc;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class day1 {
	@BeforeTest
	public void mobilelogin()
	{
		System.out.println("belong to day1 method name mobile login");
	}
	@AfterTest
	public void mobilelogout()
	{
		System.out.println("belong to day1 method name mobile logout");
	}
	@Test(dependsOnGroups= {"socialsite"})
	public void mobilesendingmessage()
	{
		System.out.println("belong to day1 method name mobilesendingmessage");
	}
	@Test(groups= {"socialsite"})
	public void whatsappchecking()
	{
		System.out.println("belong to day1 method name whatsappchecking");
	}
	@Test(groups= {"socialsite"})
	public void instagram()
	{
		System.out.println("belong to day1 method name instagram");
	}
	@Test(groups= {"socialsite"})
	public void facebook()
	{
		System.out.println("belong to day1 method name facebook");
	}
	@BeforeMethod
	public void Start()
	{
		
		System.out.println("--------------Start-----------");
	}
    @AfterMethod
    public void End()
    {
    	System.out.println("--------------End method----------");
    }
}
