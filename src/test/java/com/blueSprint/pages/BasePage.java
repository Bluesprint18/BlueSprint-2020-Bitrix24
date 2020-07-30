package com.blueSprint.pages;

import com.blueSprint.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements( Driver.getDriver(),this );




    }


}
