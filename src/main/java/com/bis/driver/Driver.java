package com.bis.driver;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bis.constants.FrameworkContants;
import com.bis.utility.ReadUtility;


public  class Driver {

	private Driver()
	{
		
	}
	

	
	
	public static void initdriver() throws Exception {

	
		if(Objects.isNull(DriverManager.getDriver())) {
		//	System.setProperty("webdriver.chrome.driver",FrameworkContants.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get("https://www.achieve3000.com");
			 DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	}
	
	public static void teardown()
	{
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
	
}
