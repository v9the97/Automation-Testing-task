package com.vinod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Nodechrome {

	WebDriver driver;
	String nodeURL;
	@Test
	public void setupChrome()throws MalformedURLException {
		nodeURL =  "http://192.168.1.135:4444/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 driver.get("http://www.google.com");
		
	}
	
	

}
