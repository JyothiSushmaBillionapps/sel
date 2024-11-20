package com.bis.tests;

import org.testng.annotations.Test;

import com.bis.driver.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginpageTest extends BaseTest {
	 @Test(groups = {"sanity","regression"})
	  public void login() {
		 DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 DriverManager.getDriver().findElement(By.xpath("//a[@class='login']")).click();
	      
	  }
	 

}
