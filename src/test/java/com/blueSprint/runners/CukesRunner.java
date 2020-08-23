package com.blueSprint.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src\\test\\resources\\features",
        glue = "com\\blueSprint\\stepDefinitions",
        tags = "@smoke"

)
public class CukesRunner {
}
