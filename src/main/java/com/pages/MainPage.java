package com.pages;

import com.componets.PopularCursComponent;
import com.diconfig.GuiceScoped;
import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

public class MainPage extends AbsBasePage<MainPage>{

    @Inject
    public MainPage(GuiceScoped guiceScoped) {
        super(guiceScoped.driver);
    }

}
