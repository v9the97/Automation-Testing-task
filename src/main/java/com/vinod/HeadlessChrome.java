package com.vinod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChrome {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void headLessChrome_Test1() {
		
		String path=System.getProperty("user.dir");
		String genericPathChrome=path+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.setHeadless(true);
		driver= new ChromeDriver(cOptions);
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
