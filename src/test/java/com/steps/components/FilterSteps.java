package com.steps.components;

import com.componets.PopularCursComponent;
import com.google.inject.Inject;
import io.cucumber.java.ru.Если;


public class FilterSteps {

    @Inject
    private PopularCursComponent popularCursComponent;

    @Если("^Кликнуть на заголовок курса (.*)$")
    public void cursNotSelect(String courseName) {
        popularCursComponent.filterStream(courseName).click();
    }
}
