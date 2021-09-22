package com.test.chrome;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class GoogleTestChromeMain {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		//cap.setCapability("version", "");
		//cap.setCapability("platform", "LINUX");
		WebDriver driver = new RemoteWebDriver(new URL("http://hub:4444/wd/hub"), cap);

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("google title is: "+title);

		try {
			Assert.assertEquals(title,"Google");
			System.out.println("Executed this line in try block after sucessful execution of assert function");
		}
		catch (Exception e) {
			System.out.println("executed this line catch block");
			driver.quit();
		}
		finally {
			System.out.println("executed this line in Finally block to quit webdrivers");
			driver.quit();
		}
	}

}
