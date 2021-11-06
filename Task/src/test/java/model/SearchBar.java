package model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBar {
	WebDriver driver = null;

	public SearchBar(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]");

	public void searchkey(String text) {
		driver.findElement(search).sendKeys(text);

	}

	public void clickSearchBtn() {
		driver.findElement(search).sendKeys(Keys.RETURN);

	}

}
