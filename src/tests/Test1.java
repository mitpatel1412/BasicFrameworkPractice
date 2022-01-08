package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginMethod;

public class Test1 {
	LoginMethod lm = new LoginMethod();

	String globalErr = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";

	@BeforeMethod
	public void beforeMethod() {
		lm.openBrowser("https://facebook.com");
	}

	@AfterMethod
	public void afterMethod() {
		lm.closeBrowser();
	}

	@Test
	public void wrongUsername() {
		lm.usernamePassword("auih", "");
		lm.loginClick();
		String err = lm.globalErr();
		Assert.assertEquals(err, globalErr);

	}

	@Test
	public void wrongUbsernameAndPassword() {
		lm.usernamePassword("kshdbv", "iavbsd");
		lm.loginClick();
		String err = lm.globalErr();
		Assert.assertEquals(err, globalErr);
	}

}
