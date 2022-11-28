package com.steps.components;

import com.componets.PopularCursComponent;
import com.google.inject.Inject;
import cucumber.api.java.ru.Если;


public class FilterSteps {

    @Inject
    private PopularCursComponent popularCursComponent;

    @Если("Кликнуть на заголовок курса {string}")
    public void cursNotSelect(String courceName) {
        popularCursComponent.filterStream(courceName).click();
    }
}
