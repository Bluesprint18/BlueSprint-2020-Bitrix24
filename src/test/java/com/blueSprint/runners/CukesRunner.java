package com.blueSprint.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-report.html",
        "json:target\\cucumber.json",
        "rerun:target\\rerun.txt"},
<<<<<<< HEAD
        features = "src/test/resources/features",
        glue = "com/blueSprint/stepDefinitions",

        tags ="@UFI"
=======
        features = "src\\test\\resources\\features",
        glue = "com\\blueSprint\\stepDefinitions",
        tags = "@winUpload"
>>>>>>> a8be10259631b57df061723ea63c83c53862c974

)
public class CukesRunner {
}
