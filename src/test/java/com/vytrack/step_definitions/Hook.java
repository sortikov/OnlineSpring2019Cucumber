package com.vytrack.step_definitions;


import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.sk.Tak;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup (Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }




    @After
    public void teardown (Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte [] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
        System.out.println("AFTER");
    }



//    @Before(value = "@storemanager", order = 1)
//    public void setupForStoreManager (Scenario scenario) {
//        System.out.println(scenario.getName());
//        System.out.println("BEFORE for Storemanager");
//    }
//        @After (value = "@storemanager", order = 1 )
//    public void teardownForStoreManager (){
//        System.out.println("AFTER for store manager");
//    }
}
