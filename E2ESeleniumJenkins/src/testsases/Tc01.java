package testsases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc01 {
	
	@Test
	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("aravind.win@gmail.com");
		driver.findElementById("pass").sendKeys("Cyprus@123");
	}

}
