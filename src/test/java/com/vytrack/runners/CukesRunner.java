package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
          "html:target/default-cucumber-reports"
        },
        tags ={"@storemanager or @negative or @driver"},
        features = {
                "src/test/resources/features/fleet",
                "src/test/resources/features/login"
                //to specify where are the features
        },

        //feature contains scenarios
        //every scenario is like a test
        //where is the imlementation for features
        glue = {"com/vytrack/step_definitions"},
        //dry run to generate step definitions automatically
        //you will see them in console output
        dryRun = false
)

public class CukesRunner {
}
