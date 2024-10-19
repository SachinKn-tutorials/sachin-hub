package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebdriverActions {
    private final WebDriver driver;

    public WebdriverActions(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void type(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public void type(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }
}
