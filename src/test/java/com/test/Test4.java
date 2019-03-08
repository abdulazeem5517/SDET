package com.test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {

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
        public void testPageTitleSample2() {
            driver.navigate().to("http://www.google.com");
            String strPageTitle = driver.getTitle();
            System.out.println("Page title: - "+strPageTitle);
            Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
            
           /* driver.get("file:///C:/Users/admin/Downloads/dotnet_TheRaceforEmpires.pdf");
            URL url = new URL(driver.getCurrentUrl());
            InputStream is = url.openStream();
            BufferedInputStream fileToParse = new BufferedInputStream(is);
            PDDocument document = null;
            try {
                document = PDDocument.load(fileToParse);
                String output = new PDFTextStripper().getText(document);
            } finally {
                if (document != null) {
                    document.close();
                }
                fileToParse.close();
                is.close();
            }*/
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
