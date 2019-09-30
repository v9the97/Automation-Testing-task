package com.vinod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	//WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
	    	
		String path = System.getProperty("user.dir");
		String genericPathChrome = path + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.name("firstName")).sendKeys("arah");
		driver.findElement(By.name("lastName")).sendKeys("janni");
		driver.findElement(By.name("phone")).sendKeys("787123456");
		driver.findElement(By.id("userName")).sendKeys("xyz2");
		driver.findElement(By.name("address1")).sendKeys("vidisha");
		driver.findElement(By.name("address2")).sendKeys("vidisha");
		driver.findElement(By.name("city")).sendKeys("vidisha");
		driver.findElement(By.name("state")).sendKeys("m.p");
		driver.findElement(By.name("postalCode")).sendKeys("464001");

		WebElement element = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select countryDropDown = new Select(element);
		countryDropDown.selectByVisibleText("INDIA");

		driver.findElement(By.name("email")).sendKeys("rr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");

		driver.findElement(By.name("register")).click();

		String actual = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/"))
				.getText();
		System.out.println(actual);

	}

}
