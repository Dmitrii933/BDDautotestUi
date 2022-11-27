package com.componets;
import com.data.DateData;
import com.diconfig.GuiceScoped;
import com.google.inject.Inject;
import com.wait.WaitElementVisible;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class PopularCursComponent<T> extends AbsComponent<PopularCursComponent> {

    @Inject
    public PopularCursComponent(GuiceScoped guiceScoped) {

        super(guiceScoped.driver);

    }
    @FindBy(css = ".lessons__new-item-bg")
    private List<WebElement> popularCursItems;

    @FindBy(css = ".lessons__new-item-start")
    private List<WebElement> dateElement;

    @FindBy(css = ".lessons__new-item-container")
    private List<WebElement> titleCursItems;



    public T waitLogoVisible(WebDriver driver, WebElement element) {
        WaitElementVisible.waitElementVisible(driver, element);
        return (T) this;
    }
    private List<LocalDate> getDateFromPage() {
        List<WebElement> elements = driver.findElements(By.cssSelector(".lessons__new-item-start"));

        List<LocalDate> localDateList = elements
                .stream()
                .map(element -> {
                    String text = element.getText().trim().replace("С ", "");
                    Pattern pattern = Pattern.compile("(\\d+\\s+[а-яА-Я]+).*");
                    Matcher matcher = pattern.matcher(text);
                    if (matcher.find()) {
                        String data = matcher.group(1);
                        String month = data.split("\\s+")[1].trim();
                        return data.replace(month, String.format("%d", getMonthByName(month))) + " " + LocalDate.now().getYear();
                    }
                    return null;
                })
                .map(dataStr -> {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
                    return LocalDate.parse(dataStr, dateTimeFormatter);
                })
                .collect(Collectors.toList());
        return localDateList;
    }

    private int getMonthByName(String name) {
        for (DateData data : DateData.values()) {
            if (data.getName().equals(name)) {
                return data.getNumber();
            }
        }
        return 0;
    }

    public void movePopularCursItems(int index) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(popularCursItems.get(index))
                .click(popularCursItems.get(index))
                .moveByOffset(0, 0)
                .build()
                .perform();
    }

    public WebElement filterStream(String title) {
        WebElement element = titleCursItems
                .stream()
                .filter((val) -> val.getText().trim().toLowerCase(Locale.ROOT).contains(title.toLowerCase(Locale.ROOT).trim()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        waitLogoVisible(driver, element);
        return element;
    }


    public LocalDate dateStreamReduce(BinaryOperator<LocalDate> operator) {
        List<LocalDate> localDates = getDateFromPage();
        LocalDate dateMaxMin = localDates
                .stream()
                //.reduce((x,y)-> x.isAfter(y) ? y : x)
                .reduce(operator)
                .orElse(null);
        return dateMaxMin;
    }

}