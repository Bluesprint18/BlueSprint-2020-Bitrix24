package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.LoginPage;
import com.blueSprint.utilities.ConfigurationReader;
import com.blueSprint.utilities.Driver;
import com.blueSprint.utilities.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver().get( ConfigurationReader.getProperty( "url" ) );
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
    }
    @After("@failTest")
    public void screenshot(Scenario scenario) throws IOException {
        ScreenShot screenShot = new ScreenShot();
        boolean result = scenario.isFailed();
        if (result==true){
            screenShot.screenShot( "img01" );
        }
    }
}
