package main;

import com.annotations.Driver;
import com.componets.PopularCursComponent;
import com.extensions.UIExtension;

import com.pages.SolutionarchitectPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;
import com.pages.MainPage;

import java.util.Locale;


@ExtendWith(UIExtension.class)
public class MainPage_Test {

    @Driver
    private WebDriver driver;

    @Test
    public void filterTest (){
        new MainPage(driver)
                .open();

        new PopularCursComponent(driver).selectTitle("Cloud Solution Architecture").
                filterStream().click();

new SolutionarchitectPage(driver)
                        .getTitle(title);

    }

    @Test
    @Disabled
    public void maxDateTest (){

        new MainPage(driver)
                .open();

        new PopularCursComponent(driver)
        .dateStreamMax();
    }

    @Test
    @Disabled
    public void minDateTest (){

        new MainPage(driver)
                .open();

        new PopularCursComponent(driver)
                .dateStreamMin();
    }

    @Test
    @Disabled
    public void actionMoveElementTest (){

        new MainPage(driver)
                .open();

        new PopularCursComponent(driver)
                .movePopularCursItems(1);

    }

}
