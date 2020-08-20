package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
	}
	@Test(priority=0)      //minimum priority firstly execute
	public void Quickyes()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://quickyes.in/");
	}
	@Test(priority=-1)      //minimum priority firstly execute
	public void facebook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://facebook.com/");
	}
	@Test
	public void Instagram()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://facebook.com/");
	}

}
