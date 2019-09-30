package com.vinod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Sikuli {

	WebDriver driverChrome;

	@Test
	public void browser() {

		String path = System.getProperty("user.dir");
		String genericPathChrome = path + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driverChrome.manage().deleteAllCookies();

	}

	@Test
	public void cart() throws InterruptedException, IOException {

		/*driverChrome.get("https://www.flipkart.com");
		driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("9028055581");
		driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).clear();
		Thread.sleep(10000);
		driverChrome.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("pavan2205");
		driverChrome.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		/*
		 * Thread.sleep(5000);
		 * driverChrome.findElement(By.xpath("//a[@class=\"_3ko_Ud\"]")).click();
		 * Thread.sleep(5000);
		 */
		driverChrome.get("https://www.flipkart.com");
		/*WebElement element = driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		Actions action = new Actions(driverChrome);
		Action build = action.moveToElement(element).sendKeys("rahul").build();
		build.perform();*/
		Actions action = new Actions(driverChrome);
		WebElement elementClick = driverChrome.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		Action build1 = action.click(elementClick).build();
		build1.perform();
		
		Thread.sleep(10000);
	}

	@Test
	public void sikuliMethod() throws FindFailed, InterruptedException {

		Screen screen = new Screen();
		Pattern searchBox = new Pattern("C:\\Users\\rahul\\Downloads\\searchBox.PNG");
		screen.type(searchBox, "Book");
		screen.click(searchBox);

		Thread.sleep(5000);

	}
	
	@Test(priority=1)
	public void popup() {
		
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		WebElement element =  driverChrome.findElement(By.xpath("//button[@type=\\\"submit\\\"])[2]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	//	Alert alert = driverChrome.
	}
	@AfterTest
	public void closeBrowser() {
	//	driverChrome.close();
	//	driverChrome.quit()
	}
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException {
		Sikuli flip = new Sikuli();
		flip.browser();
		flip.cart();
		flip.sikuliMethod();

	}

}
