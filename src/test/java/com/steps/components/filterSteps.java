package com.steps.components;

import com.componets.PopularCursComponent;
import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Тогда;

public class filterSteps {

    @Inject
    private PopularCursComponent popularCursComponent;

@Если("Выбран заголовок курса {string}")
public void cursNotSelect(String courceName){
    popularCursComponent.setTitle(courceName);
}

@Тогда("Найден курс который соотвествует заголовку {string}")
    public void seletCurs(){
    popularCursComponent.filterStream();
}
}
