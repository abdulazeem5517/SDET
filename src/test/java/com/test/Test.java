package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Solarturbines_Workspace\\Mvn_SauceLabs\\driver\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open facebook
		driver.get("https://login.salesforce.com/");

		// Maximize browser

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("testusername");
		driver.findElement(By.id("password")).sendKeys("testpassword");
		driver.findElement(By.id("Login")).click();
		
		WebElement identifier = driver.findElement(By.id("mySelect"));
		Select select = new Select(identifier);
		select.selectByVisibleText("test");
		select.selectByValue("option1");
		

	}

}
