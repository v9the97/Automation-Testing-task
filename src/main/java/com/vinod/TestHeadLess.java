package com.vinod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestHeadLess {
	
	WebDriver driver;
	
	@Test
	public void HeadlessBrowser_Test() {
		
		driver = new HtmlUnitDriver();
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.err.println(title);
		
		driver.get("http://newtours.demoaut.com/");
		String titlemercury  = driver.getTitle();
		System.out.println(titlemercury);
		
	}

}
