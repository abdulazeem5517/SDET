package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
    
WebDriver driver;
    
    @BeforeClass
    public void setUp() {
        System.out.println("*******************");
        System.out.println("launching the browser");
        System. setProperty("webdriver.chrome.driver", "C:\\SDET\\SDET\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testPageTitleSample1() {
        driver.navigate().to("http://www.google.com");
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - "+strPageTitle);
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
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