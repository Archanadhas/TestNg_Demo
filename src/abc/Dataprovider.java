package abc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="Credentials")
	public void login(String name,String password)
	{
		System.out.println("Name="+name);
		System.out.println("password="+password);
	}
	@Test(dependsOnMethods= {"login"})
	public void dataprocessing()
	{
		System.out.println("data processingwork going on");
	}
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("logout successfully");
	}
	@DataProvider(name="Credentials")
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="first user";
		data[0][1]="first password";
		data[1][0]="second user";
		data[1][1]="second password";
		data[2][0]="third user";
		data[2][1]="third password";
		return data;
		
	}


}
