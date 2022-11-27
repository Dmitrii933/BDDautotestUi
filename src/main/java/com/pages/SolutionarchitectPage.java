package com.pages;


import com.componets.PopularCursComponent;
import com.diconfig.GuiceScoped;
import com.google.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class SolutionarchitectPage extends AbsBasePage<SolutionarchitectPage> {
    @Inject
    public SolutionarchitectPage(GuiceScoped guiceScoped) {

        super(guiceScoped.driver);
    }
}
