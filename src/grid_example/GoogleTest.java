package grid_example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	@Test
	public void homepagechechk() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.isOSX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.116.1:4444"),cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("nksoftpune.com");
	}
}
