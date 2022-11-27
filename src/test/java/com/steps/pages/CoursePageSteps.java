package com.steps.pages;

import com.google.inject.Inject;
import com.pages.SolutionarchitectPage;
import io.cucumber.java.ru.Тогда;

public class CoursePageSteps {

    @Inject
    private SolutionarchitectPage solutionarchitectPage;

    @Тогда("Открыта страница c загловком курса {string}")
    public void selectCurs(String header) {
        solutionarchitectPage.pageHeaderShouldBeSameAs(header);
    }
}
