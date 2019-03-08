package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
 
public class SampleSauceTest {
 
  public static final String USERNAME = "azeem5515";
  public static final String ACCESS_KEY = "865af9a4-7e3f-45d4-ab99-61e5bd752bec";
  public static final String SAUCEURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("version", "latest");
 
    WebDriver driver = new RemoteWebDriver(new URL(SAUCEURL), caps);
 
    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */
 
    driver.get("https://login.salesforce.com");
    System.out.println("title of page is: " + driver.getTitle());   
    driver.findElement(By.id("username")).sendKeys("abdulazeem5517@gmail.com");
    driver.findElement(By.id("password")).sendKeys("azeem_#5517");
    driver.findElement(By.id("Login")).click();
    Thread.sleep(3000);
    System.out.println("title of Main page is: " + driver.getTitle());
    driver.findElement(By.id("setupLink")).click();
    System.out.println("title of Setup page is: " + driver.getTitle());
       
    driver.quit();
  }
}