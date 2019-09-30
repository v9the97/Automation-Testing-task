package com.vinod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class FlipKart {

	WebDriver driver;
	private ConfigFileReader configFileReader;
	public FlipCart() {
		ConfigFileReader configFileReader = new ConfigFileReader();
	}
	@Test
	public void browser() {
		
		String genericPathChrome =  configFileReader.getDriverPath();
		System.setProperty("webdriver.chrome.driver", genericPathChrome);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

	@Test
	public void login() throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\rahul\\Documents\\Book.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(0);
		String userName = row.getCell(0).getStringCellValue().toString();

		String password = row.getCell(1).getStringCellValue().toString();

		System.out.println(userName + password);

		driverChrome.get("https://www.flipkart.com");
		driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("8120192979");
		// driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")).clear();
		Thread.sleep(10000);
		driverChrome.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rahul@123");
		driverChrome.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();

		/*
		 * Thread.sleep(5000);
		 * driverChrome.findElement(By.xpath("//a[@class=\"_3ko_Ud\"]")).click();
		 * Thread.sleep(5000);
		 */
		// driverChrome.get("https://www.flipkart.com");
		/*
		 * WebElement element =
		 * driverChrome.findElement(By.xpath("(//input[@type=\"text\"])[2]")); Actions
		 * action = new Actions(driverChrome); Action build =
		 * action.moveToElement(element).sendKeys("rahul").build(); build.perform();
		 */
		// Actions action = new Actions(driverChrome);
		// WebElement elementClick =
		// driverChrome.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		// Action build1 = action.click(elementClick).build();
		// build1.perform();

		// Thread.sleep(10000);Boo
	}

	/*@Test
	public void action() {
		Actions action = new Actions(driverChrome);
		WebElement elementClick = driverChrome.findElement(By.xpath());
		Action event = action.click(elementClick).build();
		event.perform();
	}
*/
	@Test
	public void sikuliMethod() throws FindFailed, InterruptedException {

		Screen screen = new Screen();
		Pattern searchBox = new Pattern("C:\\Users\\rahul\\Downloads\\searchBox.PNG");
		screen.type(searchBox, "Book");
		//driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Pattern searchIcon = new Pattern("C:\\Users\\rahul\\Downloads\\searchIcons.PNG");
		screen.click(searchIcon);
		driverChrome.findElement(By.linkText("Objective General English")).click();
		driverChrome.findElement(By.xpath("//button[@title=ADD TO CART]")).click();
		driverChrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driverChrome.close();	
		}

}
