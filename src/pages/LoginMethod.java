package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginMethod {
	WebDriver driver;

	public void openBrowser(String website) {
		System.setProperty("webdriver.gecko.driver", "/Users/mit/Desktop/QA/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(website);
	}

	public void closeBrowser() {
		driver.close();
	}

	public void usernamePassword(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	public void loginClick() {
		driver.findElement(By.name("login")).click();
	}

	public String globalErr() {
		String err = driver.findElement(By.className("_9ay7")).getText();
		return err;
	}

}
