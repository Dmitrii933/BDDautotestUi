package com.steps.pages;

import com.google.inject.Inject;
import com.pages.MainPage;
import io.cucumber.java.ru.Пусть;

public class MainPageSteps {
@Inject
    private MainPage mainPage;

@Пусть("Открываем главную страницу")
    public void open(){
mainPage.open();
}


}
