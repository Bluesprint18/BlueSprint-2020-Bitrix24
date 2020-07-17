package com.blueSprint.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public void screenShot(String fileName) throws IOException {
        File file = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs( OutputType.FILE );
        FileUtils.copyFile( file, new File( "C:\\Users\\bahti\\IdeaProjects\\BlueSprint-2020-BITRIXX24\\" +
                "src\\testOutput\\screenShot"+ fileName + ".jpg" ) );
    }
}
