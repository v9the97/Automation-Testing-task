package com.vinod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

/*
 * Class to implement webdriver methods
 */
public class WebDriverMethods {
	WebDriver driverChrome;
	
	@Test
	public void browser() {
		String path=System.getProperty("user.dir");
		String genericPathChrome=path+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		driverChrome= new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}
	
	@Test(enabled=true)
	public void driverMethods() {
		driverChrome.get("https://www.google.com/");
		System.out.println("print current url: "+driverChrome.getCurrentUrl());
		System.out.println("print page source "+driverChrome.getPageSource());
		System.out.println("title of page "+driverChrome.getTitle());
//		WebElement element =driverChrome.findElement(By.tagName("input"));
	  //  element.sendKeys("hello world");
		driverChrome.get("https://www.facebook.com");
		driverChrome.navigate().back();
		driverChrome.navigate().forward();
		driverChrome.quit();
		driverChrome.close();
		
	}
	
	@Test(enabled=false)
	public void actionMethods() {
		Actions action = new Actions(driverChrome);
		
		
	}
	
	@Test 
	public void useLocators() {
		driverChrome.get("https://www.w3schools.com/");
		driverChrome.findElement(By.id("navbtn_references")).click();
		WebDriverWait wait = new WebDriverWait(driverChrome,10);
		WebElement element ;
		element = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"navbtn_tutorials\"]")));
		element.click();
		driverChrome.findElement(By.linkText("EXERCISES")).click();
		String titleName =driverChrome.findElement(By.tagName("title")).getText();
		System.out.println(titleName);
	}
	@Test(enabled=true)
	public void sekuliMethod() throws FindFailed, InterruptedException {
		driverChrome.get("https://www.google.com/");
		Screen screen = new Screen();
		
		Pattern gridIcon = new Pattern("C:\\Users\\rahul\\Downloads\\grid.PNG");
		screen.type(gridIcon, "grid");
		screen.click(gridIcon);

		Thread.sleep(5000);

	}

}
