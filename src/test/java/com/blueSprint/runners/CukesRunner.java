package com.blueSprint.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import sun.plugin2.main.server.Plugin;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-report.html",
        "json:target\\cucumber.json",
        "rerun:target\\rerun.txt"},
        features = "src\\test\\resources\\features",
        glue = "com\\blueSprint\\stepDefinitions",
        tags = "@wip"

)
public class CukesRunner {
}
