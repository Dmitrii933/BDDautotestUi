package com.hooks;

import com.diconfig.GuiceScoped;
import com.google.inject.Inject;
import org.junit.After;

public class Hooks {

    @Inject
    private GuiceScoped guiceScoped;

    @After
    public void afterEach() {
        if(guiceScoped.driver != null) {
            guiceScoped.driver.close();
            guiceScoped.driver.quit();
        }
    }
}
