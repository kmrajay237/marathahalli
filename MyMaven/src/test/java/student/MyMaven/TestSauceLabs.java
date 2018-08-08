package student.MyMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
public class TestSauceLabs {
	public static final String USERNAME = "lochiajay";
	public static final String ACCESS_KEY = "b445ef8c-9824-4a33-a648-556c8e222b7f";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "54.0");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Selenium");
		ele.sendKeys(Keys.ENTER);
		System.out.println("title of page is: " + driver.getTitle());
		driver.quit();
	}
}
