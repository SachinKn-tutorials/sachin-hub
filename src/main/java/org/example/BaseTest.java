package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is beforeSuite()");
        System.setProperty("webdriver.chrome.driver", "D:\\Work\\EXEs\\chromedriver.exe");
        // Delete the test-output
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is beforeMethod()");
        // Extent report creation
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is afterMethod()");
        // close driver
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is afterSuite()");
        // Flush report
        // save logs to file
        // Archive the test-output
    }
}
