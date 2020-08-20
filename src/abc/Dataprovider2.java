package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
	WebDriver driver;
	@Test
	public void a()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test
	public void b()
	{
		driver.get("https://www.facebook.com");
				
	}
	@Test(dataProvider="Credentials")
	public void c(String name,String password)
	{
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	@Test
	public void d()
	{
		System.out.println("data processingwork going on");
	}
	@Test
	public void e()
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
