package grid_example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Facebooktest {
	
	
	@Test
	public void homepagechechk() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.isOSX);
		cap.setCapability(CapabilityType.BROWSER_NAME, "f	irefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.116.1:4444"),cap);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}
}
