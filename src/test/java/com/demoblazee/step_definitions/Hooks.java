package com.demoblazee.step_definitions;

import com.demoblazee.utilities.Driver;
import io.cucumber.java.After;


public class Hooks {
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
