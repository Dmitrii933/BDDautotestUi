package main;

import com.annotations.Driver;
import com.componets.PopularCursComponent;
import com.diconfig.GuiceScoped;
import com.exception.BrowserNotSupportedException;
import com.extensions.UIExtension;

import com.pages.SolutionarchitectPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;
import com.pages.MainPage;

import java.util.Locale;


@ExtendWith(UIExtension.class)
public class MainPage_Test {


    private GuiceScoped guiceScoped = new GuiceScoped();

    public MainPage_Test() throws BrowserNotSupportedException {
    }

    @Test
    public void checkElementToTitleTest() {
        String title = "Data Engineer";
        new MainPage(guiceScoped)
                .open();

        new PopularCursComponent(guiceScoped).
                filterStream(title).click();

        new SolutionarchitectPage(guiceScoped)
                .pageHeaderShouldBeSameAs(title);

    }

    /*@Test
    @Disabled
    public void maxDateTest() {

        new MainPage(guiceScoped)
                .open();

        new PopularCursComponent(guiceScoped)
                .dateStreamReduce((x, y) -> y.isAfter(x) ? y : x);
    }*/

   /* @Test
    @Disabled
    public void minDateTest() {

        new MainPage(guiceScoped)
                .open();

        new PopularCursComponent(guiceScoped)
                  .dateStreamReduce((x, y) -> y.isAfter(x) ? x : y);

    }*/

    @Test
@Disabled
    public void checkElementMoveTest() {

        new MainPage(guiceScoped)
                .open();

        new PopularCursComponent(guiceScoped)
                .movePopularCursItems(1);
    }

}
