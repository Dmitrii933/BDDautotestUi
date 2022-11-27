package com.steps.components;

import com.componets.PopularCursComponent;
import com.google.inject.Inject;
import com.pages.SolutionarchitectPage;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class filterSteps {

    @Inject
    private PopularCursComponent popularCursComponent;

    @Если("Кликнуть на заголовок курса {string}")
    public void cursNotSelect(String courceName) {
        popularCursComponent.filterStream(courceName).click();
    }
}
