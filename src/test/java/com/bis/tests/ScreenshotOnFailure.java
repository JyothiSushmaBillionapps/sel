package com.bis.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.bis.driver.DriverManager;

public class ScreenshotOnFailure extends BaseTest {
    public static void takeScreenshot(WebDriver driver, String testName, String testStep) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot)DriverManager.getDriver();
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String screenshotName = testName + "_" + testStep + ".png";
        FileHandler.copy(screenshot, new File(screenshotName));
        System.out.println("Screenshot saved: " + screenshotName);
    }
}