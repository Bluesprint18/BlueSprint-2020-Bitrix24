package com.blueSprint.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class UserStory_Two_Runner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumber-report.html",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"},

            features = "src/test/resources/features",
            glue = "com/blueSprint/stepDefinitions",
            tags = "@UFI"
    )


    public class CukesRunner {
    }

}


