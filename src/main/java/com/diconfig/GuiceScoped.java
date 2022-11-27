package com.diconfig;

import com.driver.DriverFactory;
import com.exception.BrowserNotSupportedException;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class GuiceScoped {

    public final WebDriver driver = new DriverFactory().getDriver();

    public GuiceScoped() throws BrowserNotSupportedException {
    }
}
