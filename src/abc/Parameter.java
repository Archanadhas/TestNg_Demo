package abc;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	@Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test(dependsOnMethods= {"openbrowser"})
	public void Enterurl()
	{
		driver.get("http://demo.guru99.com/test/delete_customer.php");
				
	}
	@Test(dependsOnMethods= {"openbrowser","Enterurl"})
	@Parameters({"val1"})
	public void datatitle(@Optional("default")String name)     //Optional parameter
	{
		driver.findElement(By.name("cusid")).sendKeys(name);
		driver.findElement(By.name("submit")).submit();
	}
	@Test(dependsOnMethods= {"openbrowser","Enterurl","datatitle"})
	public void ztaskcomplete() throws InterruptedException
	{
		Alert alert =driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		
		
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
		
		
	}
}
