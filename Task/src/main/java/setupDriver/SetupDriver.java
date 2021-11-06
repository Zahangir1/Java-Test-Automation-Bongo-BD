package setupDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver driver;

	@BeforeSuite
	public static void openDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterSuite
	public static void close() {
		driver.close();
		driver.quit();
	}

}
