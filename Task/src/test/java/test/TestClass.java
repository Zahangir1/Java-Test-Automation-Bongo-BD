package test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import model.SearchBar;
import setupDriver.SetupDriver;

public class TestClass extends SetupDriver {
	public static String baseUrl = "https://bongobd.com/";

	
	@Test
	public static void MainNavbar() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.manage().window().maximize();
		Thread.sleep(000);
		String actualTitle = "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";
		Thread.sleep(3000);
		String siteTitle = driver.getTitle();
		assertEquals(siteTitle, actualTitle);
		System.out.println("Title: " + siteTitle);

	}
	
	@Test (priority = 7)
	public void enterIntoSearchBox() throws InterruptedException {
		driver.navigate().forward();
		SearchBar searchBar = new SearchBar(driver);
		searchBar.searchkey("Panther");
		Thread.sleep(2000);
		searchBar.clickSearchBtn();
		Thread.sleep(3000);
		String searching = "SEARCHING";
		System.out.println("Successfully visit: " + searching);

	}

	@Test(priority = 3)
	public void enterIntoKidsBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//span[contains(text(),'Kids')]")).click();
		Thread.sleep(2000);
		String kids = "KIDS";
		System.out.println("Successfully visit: " + kids);

	}

	@Test(priority = 1)
	public void enterIntoSportsBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//span[contains(text(),'Sports')]")).click();
		Thread.sleep(2000);
		String sport = "SPORTS";
		System.out.println("Successfully visit: " + sport);

	}

	@Test(priority = 4)
	public void enterIntoMoviesBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		String movies = "MOVIES";
		System.out.println("Successfully visit: " + movies);

	}

	@Test(priority = 2)
	public void enterIntoTvBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/a[4]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		String tv = "TV";
		System.out.println("Successfully visit: " + tv);

	}

	@Test(priority = 5)
	public void enterIntoMusicBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//span[contains(text(),'Music')]")).click();
		Thread.sleep(2000);
		String music = "MUSIC";
		System.out.println("Successfully visit: " + music);

	}

	@Test(priority = 6)
	public void enterIntoDiscoverBtn() throws InterruptedException {
		driver.navigate().forward();
		driver.findElement(By.xpath("//span[contains(text(),'Discover')]")).click();
		Thread.sleep(2000);
		String discover = "DISCOVER";
		System.out.println("Successfully visit: " + discover);

	}


}