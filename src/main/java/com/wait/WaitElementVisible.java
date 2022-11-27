package com.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class WaitElementVisible {

    public static WebElement waitElementVisible(WebDriver driver, WebElement element){

        return new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
