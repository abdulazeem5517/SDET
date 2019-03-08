package com.test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test5 {

        public WebDriver driver;
        
        @BeforeClass
        public void setUp() {
            System.out.println("*******************");
            System.out.println("launching chrome  browser");
            System. setProperty("webdriver.chrome.driver", "C:\\Solarturbines_Workspace\\AutomationPOCs\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        
        @Test
        public void testPageTitleSample2() throws InterruptedException {
            driver.navigate().to("http://www.google.com");
            String strPageTitle = driver.getTitle();
            System.out.println("Page title: - "+strPageTitle);
            Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
            
            driver.get("chrome://settings");
           /* WebElement w = driver.findElement(By.xpath("//iframe[@name='settings']"));
            driver=driver.switchTo().frame(w);

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Show advanced settings...']"))).click();*/
            
            Thread.sleep(5000);
            driver.findElement(By.id("advancedToggle")).click();

            
        }
        
        @Test
        public void testSampleOne() {
            System.out.println("Im in test sample one");
        }
        
        @Test
        public void testSampleTwo() {
            System.out.println("Im in test sample two");
        }
        
        @Test
        public void testSampleThree() {
            System.out.println("Im in test sample three");
        }

        @AfterClass
        public void tearDown() {
            if(driver!=null) {
                System.out.println("Closing the browser");
                driver.quit();
            }
        }
        
    
}
