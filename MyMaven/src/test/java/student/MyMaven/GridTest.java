package student.MyMaven;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws Exception {
		String URL="https://www.google.com/";
		String NODE="http://192.168.0.106:4444/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL(NODE),cap);
		driver.navigate().to(URL);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.close();
	}

}
