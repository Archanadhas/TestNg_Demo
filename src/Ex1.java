import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1 {
	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void Quickyes()
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumjava\\abc\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
