package com.steps.components;

import com.componets.PopularCursComponent;
import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Тогда;

public class FilterSteps {

    @Inject
    private PopularCursComponent popularCursComponent;

    @Если("Кликнуть на заголовок курса {string}")
    public void cursNotSelect(String courceName) {
        popularCursComponent.filterStream(courceName).click();
    }
}
